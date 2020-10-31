package com.pplove.hzwebapi.service.serviceImpl;


import com.pplove.hzwebapi.mapper.SysUserMapper;
import com.pplove.hzwebapi.service.GetDataService;
import com.pplove.hzwebapi.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetDataServiceImpl implements GetDataService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SysUserMapper sysUserMapper;

    public SysUser getSysUserById(long id) {
        SysUser info = sysUserMapper.selectById(id);

        return info;
    }
}
