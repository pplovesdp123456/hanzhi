package com.pplove.hzwebapi.service.serviceImpl;

import com.pplove.common.entity.User;
import com.pplove.hzwebapi.mapper.UserMapper;
import com.pplove.hzwebapi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
