package com.pplove.hzwebapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pplove.common.entity.SysUser;
import com.pplove.hzwebapi.model.query.SysUserQuery;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
public interface SysUserService extends IService<SysUser> {

    List<SysUser> getUserList();
    List<SysUser> getUserList(SysUserQuery query);
}
