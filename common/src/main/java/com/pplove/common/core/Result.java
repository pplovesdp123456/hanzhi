package com.pplove.common.core;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class Result<T> {

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
     * 返回的数据
     */
    private T data;

    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }
    public static Result fail(Integer status, String message){
        Result result = new Result();
        result.setCode(status);
        result.setMessage(message);
        return result;
    }
    public static Result fail(Integer status, String message, String detail){
        Result result = new Result();
        result.setCode(status);
        result.setMessage(message);
        result.setDetail(detail);
        return result;
    }

    public static Result fail(ResultCode resultCode){
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static <T> Result success(T data) {
        return new Result<T>(ResultCode.SUCCESS, data, null);
    }

    public Result() {
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Result(ResultCode resultCode, T data, String detail) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
        this.detail = detail;
    }

    public Result setResultCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public Boolean checkSuccess() {
        if (null != this.code && this.code == 0) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
