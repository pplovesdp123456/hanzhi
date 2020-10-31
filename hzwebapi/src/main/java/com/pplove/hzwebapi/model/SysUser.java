package com.pplove.hzwebapi.model;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "登录帐号")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户姓名")
    private String nickname;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date createTime;

    @ApiModelProperty(value = "最后登录时间")
    private Date lastLoginTime;

    @ApiModelProperty(value = "是否被禁止登录")
    private String forbidden;

//    @TableLogic(value = "")
    @ApiModelProperty(value = "是否被删除")
    private String deleted;

    @ApiModelProperty(value = "工号")
    private String personnelJob;

    @ApiModelProperty(value = "创建人ID")
    private Integer createUserId;

    private Integer departmentId;

    @ApiModelProperty(value = "NFC信息表ID")
    private Integer nfcId;


}
