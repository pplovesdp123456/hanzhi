package com.pplove.hzwebapi.controller;

import com.pplove.common.core.Result;
import com.pplove.common.entity.Pet;
import com.pplove.hzwebapi.service.GetDataService;
import com.pplove.hzwebapi.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("宠物接口")
@RestController
public class PetController {

    @Autowired
    GetDataService getDataService;

    @GetMapping("getSysUserById")
    public Result getSysUserById(long id) {
        SysUser info = getDataService.getSysUserById(id);
        return Result.success(info);
    }

    @ApiOperation("创建宠物")
    @PostMapping("/createPet")
    public Pet createPet(@RequestBody @Validated Pet pet){

        Pet p = pet;
        System.out.println(pet.toString());

//        Assert.notNull(null,"宠物不存在");
        return p;

    }
}
