package com.pplove.hzwebapi.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pplove.hzwebapi.model.SysUser;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectAll();
}
