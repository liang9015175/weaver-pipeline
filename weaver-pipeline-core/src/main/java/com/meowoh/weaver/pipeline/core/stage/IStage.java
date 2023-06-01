package com.meowoh.weaver.pipeline.core.stage;

import com.meowoh.weaver.pipeline.core.context.IStageContext;
import com.meowoh.weaver.pipeline.core.exception.StageException;

/**
 * Stage basic interface
 * <p>
 * stage is a basic unit of pipeline, it can be a single task or a group of tasks.
 * it contains init method and destroy method, which will be called before and after the stage is executed.
 * it also contains a execute method, which will be called when the stage is executed.
 *
 * </p>
 *
 * @author songliangliang
 * @version 1.0
 * @since 2023/5/31
 */
public interface IStage {

    /**
     * stage init
     *
     * @param stageContext stage context
     */
    void init(IStageContext stageContext);


    /**
     * pre execute method will be called before stage is executed.
     *
     * @throws StageException executions may happen when pre process.
     */
    void preExecute() throws StageException;


    /**
     * post execute method will be called after stage is executed.
     * core method which need to be implemented by the customization.
     *
     * @param o object to be executed.
     * @throws StageException execution may happen when execute.
     */
    void execute(Object o) throws StageException;


    /**
     * after all the objects are executed then do the post process.
     *
     * @throws StageException exception may happen when post process.
     */
    void postExecute() throws StageException;

    /**
     * resources released
     * pls ensure that after done postExecute, all the resources are released.such as http connections or inputstream or outputstream.
     */
    void release();
}
