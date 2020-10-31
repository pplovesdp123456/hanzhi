package com.pplove.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author sdp1599181@163.com
 * @since 2020-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRolePermission对象", description="角色权限表")
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "角色Id")
    @TableId(value = "role_id", type = IdType.ID_WORKER)
    private Integer roleId;

    @ApiModelProperty(value = "权限Id")
    private Integer permissionId;


}
