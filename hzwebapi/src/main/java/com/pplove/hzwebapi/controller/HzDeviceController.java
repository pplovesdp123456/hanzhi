package com.pplove.hzwebapi.controller;


import com.pplove.common.core.Result;
import com.pplove.hzwebapi.model.HzDevice;
import com.pplove.hzwebapi.service.HzDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@RestController
@RequestMapping("/hz-device")
public class HzDeviceController {

    @Autowired
    HzDeviceService hzDeviceService;

    @GetMapping("getDeviceById")
    public Result getDeviceById(long id) {
        HzDevice info = hzDeviceService.getDeviceById(id);
        return Result.success(info);
    }
}

