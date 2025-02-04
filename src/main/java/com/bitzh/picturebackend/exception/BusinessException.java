package com.bitzh.picturebackend.exception;

import lombok.Getter;

/**
 * 自定义异常
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/21 8:01
 */
@Getter
public class BusinessException extends RuntimeException{

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode,String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
