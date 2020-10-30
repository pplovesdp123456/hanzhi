package com.pplove.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
@ApiModel(value = "人类po定义")
public class Person {


    @ApiModelProperty(value = "姓名")
    private String name;
    private int age;
    private boolean sex;
    private Date birthday;
    private Map<String,String> area;
    private List<String> hobbits;
    private Pet pet;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", area=").append(area);
        sb.append(", hobbits=").append(hobbits);
        sb.append(", pet=").append(pet);
        sb.append('}');
        return sb.toString();
    }
}
