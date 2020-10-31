package com.pplove.hzwebapi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pplove.hzwebapi.model.HzDevice;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
public interface HzDeviceService extends IService<HzDevice> {

    HzDevice getDeviceById(long id);
}
