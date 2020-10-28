package com.pplove.hzwebapi.config;

import com.pplove.common.core.ErrorResult;
import com.pplove.common.core.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @ExceptionHandler(BusinessException.class)
    public ErrorResult handlerBusinessException(BusinessException e, HttpServletRequest request){
//        //运行时异常，可以在这里记录，发送异常邮件通知
//        ErrorResult errorResult = ErrorResult.fail(ResultCode.SYS_ERROR,e);
//        log.error("系统异常",request.getRequestURI(),e);
//        return errorResult;

        ErrorResult errorResult = ErrorResult.builder()
                .message(e.message)
                .code(e.code)
                .detail(e.message)
                .build();
        log.warn("业务异常",request.getRequestURI(),errorResult);
        return errorResult;
    }

    /**
     * validator 统一异常封装
     */

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e,HttpServletRequest request){
        String msgs = this.handle(e.getBindingResult().getFieldErrors());
        ErrorResult errorResult = ErrorResult.fail(ResultCode.SERVICE_COMM_PARAMETER_ERROR,msgs);
        log.warn("参数校验异常",request.getRequestURI(),msgs);
        return errorResult;
    }

    private String handle(List<FieldError> fieldErrors){
        StringBuilder sb = new StringBuilder();
        for(FieldError obj :fieldErrors){
            sb.append(obj.getField());
            sb.append("=[");
            sb.append(obj.getDefaultMessage());
            sb.append("] ");
        }
        return sb.toString();
    }


}
