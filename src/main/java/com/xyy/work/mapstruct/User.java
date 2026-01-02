package com.xyy.work.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private int sex;
    private List<Hobby> hobbies;
    private Date createdAt;
    private Date updatedAt;
}
