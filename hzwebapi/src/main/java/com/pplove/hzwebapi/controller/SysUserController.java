package com.pplove.hzwebapi.controller;


import com.pplove.common.entity.SysUser;
import com.pplove.hzwebapi.model.query.SysUserQuery;
import com.pplove.hzwebapi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/getUserList")
    public List<SysUser> getUserList(SysUserQuery query){
        List<SysUser> info = sysUserService.getUserList(query);

        return  info;
    }

}

