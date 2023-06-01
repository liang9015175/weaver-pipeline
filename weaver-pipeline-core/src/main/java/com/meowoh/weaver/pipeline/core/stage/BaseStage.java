package com.meowoh.weaver.pipeline.core.stage;

import com.meowoh.weaver.pipeline.core.context.IStageContext;
import com.meowoh.weaver.pipeline.core.exception.StageException;
import lombok.extern.slf4j.Slf4j;

/**
 * Common Abstract Stage
 *
 * @author songliangliang
 * @since 2023/5/31
 */
@Slf4j
public abstract class BaseStage implements IStage {

    /**
     * stage context
     */
    private IStageContext iStageContext;

    /**
     * stage init
     *
     * @param stageContext stage context
     */
    public void init(IStageContext stageContext) {
        this.iStageContext = stageContext;
    }

    /**
     * empty implementation of the preExecute method
     *
     * @throws StageException nothing to throw
     */
    public void preExecute() throws StageException {
        log.info("preExecute with stage:{}....", this.getClass().getSimpleName());
    }


    public void execute(Object o) throws StageException {
        log.info("execute with stage:{},object:{}....", this.getClass().getSimpleName(), o);
        emit(o);
    }

    private void  emit(Object o){
    }
}
