package com.bitzh.picturebackend.common;

import com.bitzh.picturebackend.exception.ErrorCode;

/**
 * 响应工具类
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/21 10:20
 */
public class ResultUtils {

    /**
     * 成功
     * @param data 数据
     * @return 响应
     * @param <T> 数据类型
     */
    public static <T> BaseResponse<T> success(T data) {return new BaseResponse<>(0,data,"ok");}

    /**
     * 失败
     * @param errorCode 错误码
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {return new BaseResponse<>(errorCode);}

    /**
     * 失败
     * @param code 错误码
     * @param message 错误信息
     * @return 响应
     */
    public static BaseResponse<?> error(int code, String message) {return new BaseResponse<>(code,message);}

    /**
     * 失败
     * @param errorCode 错误码
     * @param message 错误信息
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode,String message) {return new BaseResponse<>(errorCode.getCode(),null,message);}
}
