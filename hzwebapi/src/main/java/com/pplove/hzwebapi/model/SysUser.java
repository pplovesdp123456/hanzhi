package com.pplove.hzwebapi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author cc447233453@163.com
 * @since 2020-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;
    /**
     * 登录帐号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String nickname;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 是否被禁止登录
     */
    private String forbidden;

    /**
     * 是否被删除
     */
    private String deleted;

    /**
     * 工号
     */
    private String personnelJob;

    /**
     * 创建人ID
     */
    private Integer createUserId;

    private Integer departmentId;

    /**
     * NFC信息表ID
     */
    private Integer nfcId;



}
