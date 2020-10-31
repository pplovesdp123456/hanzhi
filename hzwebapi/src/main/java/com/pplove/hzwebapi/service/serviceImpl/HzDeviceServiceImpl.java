package com.pplove.hzwebapi.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pplove.common.entity.HzDevice;
import com.pplove.hzwebapi.mapper.HzDeviceMapper;
import com.pplove.hzwebapi.service.HzDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<HzDevice> getDeviceList() {
        return hzDeviceMapper.selectList(null);
    }

}
