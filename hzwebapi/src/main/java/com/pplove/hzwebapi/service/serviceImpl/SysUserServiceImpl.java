package com.pplove.hzwebapi.service.serviceImpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pplove.common.entity.SysUser;
import com.pplove.hzwebapi.mapper.SysUserMapper;
import com.pplove.hzwebapi.model.query.SysUserQuery;
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
    public List<SysUser> getUserList() {
        return sysUserMapper.selectList(null);
    }

    @Override
    public List<SysUser> getUserList(SysUserQuery query) {

        Page page = new Page<>(query.getPage(), query.getSize());
        IPage<SysUser> userIPage = sysUserMapper.selectPage(page,null);
        return userIPage.getRecords();
    }
}
