package com.xyy.work.mapstruct;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private String name;
    private Integer age;
    private String sex;
    private List<Hobby> hobbies;
    private Date createdAt;
}
