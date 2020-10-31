package com.pplove.hzwebapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="HzDevice对象", description="")
public class HzDevice implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String deviceId;

    private Integer groupId;

    @TableField("device_Key")
    private String deviceKey;

    @TableField("device_Addr")
    private String deviceAddr;

    private Integer nodeId;

    @TableField("node_Type")
    private String nodeType;

    @TableField("deviceDisabled")
    private String deviceDisabled;

    private String deviceName;

    private String lng;

    private String lat;

    @TableField("deviceStatus")
    private String deviceStatus;

    @TableField("realTimeData")
    private String realTimeData;

    @ApiModelProperty(value = "设备类型：1温湿度，2光照度，3土壤温度水分")
    private Integer deviceType;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date createTime;


}
