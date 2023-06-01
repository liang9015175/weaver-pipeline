package com.meowoh.weaver.pipeline.core.emit;

import com.meowoh.weaver.pipeline.core.exception.StageException;

/**
 * IEmiter interface
 *
 * @author s ongliangliang
 * @since 2023/5/31
 */
public interface IEmiter {

    /**
     * emit object to the temp queue
     *
     * @param o object
     * @throws StageException stage exception may be the queue is full or connection is broken
     */
    void emit(Object o) throws StageException;

    /**
     * pull object from the temp queue, oldest in the queue
     *
     * @return object
     */
    Object pull();

    /**
     * pull object from the temp queue ,till timeout
     *
     * @param timeout timeout in milliseconds ,if timeout is 0 ,then it will block until object is pulled
     * @return object
     * @throws StageException stage exception may be the queue is full or connection is broken, or timeout
     */
    Object pull(long timeout) throws StageException;


    /**
     * pull object from the temp queue ,till timeout
     *
     * @param timeout timeout in milliseconds ,if timeout is 0 ,then it will block until object is pulled
     * @param isBlock if true ,then it will block until object is pulled
     * @return object
     */
    Object pull(long timeout, boolean isBlock);
}
