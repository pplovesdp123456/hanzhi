package com.pplove.hzwebapi.controller;

import com.pplove.common.TestUtil;
import com.pplove.common.core.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeoutException;

@Api("测试类的文档")
@Slf4j
@RestController
public class TestController {

//    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${pplove.msg}")
    private String msg;

    @ApiOperation("得到哈喽字符串")
    @GetMapping("/getHello")
    public Result getHello(@RequestBody String b){
        return Result.success(TestUtil.getString());
    }

    @GetMapping("/getmsg")
    public String getmsg(@RequestParam int a){
        log.info("log.info");
//        logger.info("getmsg");
        return msg;
    }

    @PostMapping("/error1")
    public void error1(){
        int i = 9/0;
    }

    @PostMapping("/error0")
    public void error0(){
        try {
            int i = 9/0;
        } catch (Exception e){
            log.error(e.toString());
        }
    }

    @PostMapping("/error2")
    public void error2(){
        Integer.valueOf("a");
    }

//    @PostMapping("/error3")
//    public void error3(){
//        throw new Bus;
//    }

    @PostMapping("/error4")
    public void error4() throws TimeoutException {
        throw new TimeoutException("用户已存在");
    }

}
