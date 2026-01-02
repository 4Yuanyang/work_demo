package com.xyy.work.mapstruct;

import lombok.Data;

import java.util.List;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true) //这个注解是在需要json转换时候用的，目前用不到，可以去掉
public class UserDTO {
    private String name;
    private Integer age;
    private String sex;
    private List<Hobby> hobbies;
}
