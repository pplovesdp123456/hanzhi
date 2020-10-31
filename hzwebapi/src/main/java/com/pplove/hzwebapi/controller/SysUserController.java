package com.pplove.hzwebapi.controller;


import com.pplove.common.core.Result;
import com.pplove.hzwebapi.model.SysUser;
import com.pplove.hzwebapi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @GetMapping("getSysUserById")
    public Result getSysUserById(long id) {
        SysUser info = sysUserService.getSysUserById(id);
        return Result.success(info);
    }
}

