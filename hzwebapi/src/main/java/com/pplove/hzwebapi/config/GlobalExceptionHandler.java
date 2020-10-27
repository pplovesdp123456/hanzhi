package com.pplove.hzwebapi.config;

import com.pplove.common.core.ErrorResult;
import com.pplove.common.core.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理运行时异常
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Throwable.class)
    public ErrorResult handlerThrowable(Throwable e, HttpServletRequest request){
        //运行时异常，可以在这里记录，发送异常邮件通知
        ErrorResult errorResult = ErrorResult.fail(ResultCode.SYS_ERROR,e);
        log.error("系统异常",request.getRequestURI(),e);
        return errorResult;
    }
}
