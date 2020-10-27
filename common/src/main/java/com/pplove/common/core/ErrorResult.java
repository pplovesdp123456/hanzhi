package com.pplove.common.core;

import lombok.Data;

@Data
public class ErrorResult {

    /**
     * 调用结果码
     */
    private Integer code;

    /**
     * 调用结果说明
     */
    private String message;

    /**
     * 调用结果详细说明
     */
    private String detail;




    /**
     * 对异常提示语进行封装
     */
    public static ErrorResult fail(ResultCode resultCode,Throwable e,String message){
        ErrorResult errorResult = ErrorResult.fail(resultCode,e);
        errorResult.setMessage(message);

        return errorResult;
    }

    /**
     * 对异常枚举进行封装
     */
    public static ErrorResult fail(ResultCode resultCode,Throwable e){
        ErrorResult errorResult = new ErrorResult();
        errorResult.setMessage(resultCode.getMessage());
        errorResult.setCode(resultCode.getCode());
        errorResult.setDetail(e.getMessage());

        return errorResult;
    }
}
