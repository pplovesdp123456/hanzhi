package com.pplove.common.entity;

import com.pplove.common.annotation.Phone;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.StringJoiner;

@Data
public class Pet {

//    @NotEmpty
//    @Length(min = 6,max = 20,message = "宠物名字必须在6~20之间")
    private String nickname;

//    @NotEmpty(message = "宠物类型不能为空")
    private String animaltype;


    @Max(100)
    @Min(2)
    private int age;

//    @Pattern(regexp = "^(\\d{18,18}|\\d{15,15}|\\d{17,17}[x|X])$",message = "宠物的身份证格式错误")
    private String idnum;

//    @Email(message = "宠物的电子邮件格式错误")
    private String email;

    @Phone(message = "你输入的不对呀")
    private String phone;

    @Override
    public String toString() {
        return new StringJoiner(", ", Pet.class.getSimpleName() + "[", "]")
                .add("nickname='" + nickname + "'")
                .add("animaltype='" + animaltype + "'")
                .add("age=" + age)
                .add("idnum='" + idnum + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
