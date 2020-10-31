package com.pplove.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
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
@ApiModel(value="WxUser对象", description="")
public class WxUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String nickname;

    private String openId;

    private String phone;

    private String age;

    private String userPwd;

    private Date createDate;

    private Date updateDate;

    private String sex;

    private String language;

    private String city;

    private String province;

    private String headimgurl;

    private String remark;

    private String unionid;

    private String groupid;


}
