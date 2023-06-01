package com.meowoh.weaver.pipeline.core.exception;

import com.meowoh.weaver.pipeline.core.stage.IStage;
import lombok.Getter;

/**
 * StageException
 * <p>
 * stage exception is a exception for stage. it will be thrown when stage is executed.
 * it contains a stage field, which is the stage where the exception is thrown.
 * </p>
 *
 * @author songliangliang
 * @since 2023/5/31
 */
public class StageException extends RuntimeException {

    @Getter
    private final IStage iStage;

    public StageException(IStage iStage) {
        this.iStage = iStage;
    }

    public StageException(IStage iStage, String message) {
        super(message);
        this.iStage = iStage;
    }

    public StageException(IStage iStage, String message, Throwable cause) {
        super(message, cause);
        this.iStage = iStage;
    }
}
