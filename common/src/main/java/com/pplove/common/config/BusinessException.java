package com.pplove.common.config;

import com.pplove.common.core.ResultCode;
import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

    protected Integer code;

    protected String message;

    public BusinessException(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();

    }
}
