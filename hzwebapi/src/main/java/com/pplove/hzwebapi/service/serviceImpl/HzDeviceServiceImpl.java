package com.pplove.hzwebapi.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pplove.hzwebapi.mapper.HzDeviceMapper;
import com.pplove.hzwebapi.model.HzDevice;
import com.pplove.hzwebapi.service.HzDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Service
public class HzDeviceServiceImpl extends ServiceImpl<HzDeviceMapper, HzDevice> implements HzDeviceService {

    @Autowired
    HzDeviceMapper hzDeviceMapper;
    @Override
    public HzDevice getDeviceById(long id) {
        return hzDeviceMapper.selectById(id);
    }
}
