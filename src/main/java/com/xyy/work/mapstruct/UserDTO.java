package com.xyy.work.mapstruct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private String name;
    private Integer age;
    private String sex;
    private List<Hobby> hobbies;
}
