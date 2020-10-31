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
@ApiModel(value="HzWechatUser对象", description="")
public class HzWechatUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userAccount;

    private String wxId;

    private String wxNickname;

    private String phone;

    private String gender;

    @TableField("avatarUrl")
    private String avatarUrl;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date createTime;


}