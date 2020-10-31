package com.pplove.hzwebapi.service;

import com.pplove.common.entity.HzDevice;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
public interface HzDeviceService extends IService<HzDevice> {

    List<HzDevice> getDeviceList();
}
