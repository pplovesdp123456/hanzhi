package com.pplove.hzwebapi.config;

import com.alibaba.fastjson.JSON;
import com.pplove.common.core.ErrorResult;
import com.pplove.common.core.Result;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice(basePackages = "com.pplove.hzwebapi")
public class ResponseHandler implements ResponseBodyAdvice<Object> {
    /**
     * 是否支持advice功能
     * @return true 支持，false 不支持
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }


    /**
     * 处理response的具体业务方法
     * @param o
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        if (o instanceof ErrorResult){
            ErrorResult errorResult = (ErrorResult)o;
            return Result.fail(errorResult.getCode(),errorResult.getMessage(),errorResult.getDetail());
        } else
        if (o instanceof String) {
            return JSON.toJSONString(Result.success(o));
        }
        return Result.success(o);

    }
}
