package com.pplove.hzwebapi.service.serviceImpl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pplove.hzwebapi.mapper.SysUserMapper;
import com.pplove.hzwebapi.model.SysUser;
import com.pplove.hzwebapi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser getSysUserById(long id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public List<SysUser> getSysUserAll() {
        return sysUserMapper.selectAll();
    }
}
