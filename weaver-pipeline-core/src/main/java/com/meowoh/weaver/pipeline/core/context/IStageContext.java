package com.meowoh.weaver.pipeline.core.context;

import com.meowoh.weaver.pipeline.core.emit.IEmiter;

/**
 * Stage context
 * <p>
 * stage context is a context for stage, it contains some useful information for stage.
 * it will be passed to stage when stage is initialized. <br/>
 * it contains a registerListener method, which will be called when stage is initialized.<br/>
 * it contains a raise method, which will be called when stage is executed.<br/>
 * it contains a getBranchFeeder method, which will be called when stage is executed.<br/>
 * it contains a get method, which will be called when stage is executed while get some extra information.<br/>
 * </p>
 *
 * @author songliangliang
 * @version 1.0
 * @since 2023/5/31
 */
public interface IStageContext {


    /**
     * get emiter
     *
     * @return emiter
     */
    IEmiter getEmiter();


    /**
     * get env
     *
     * @param key key
     * @return env
     */
    String getEnv(String key);
}
