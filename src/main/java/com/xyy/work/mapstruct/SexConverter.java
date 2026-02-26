package com.xyy.work.mapstruct;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
public class SexConverter {
    @Named("intToSexName")
    public String intToSexName(int sexCode) {
        return SexType.fromCode(sexCode).getName();
    }

    @Named("sexNameToInt")
    public int sexNameToInt(String sexName) {
        if(sexName == null || sexName.isEmpty()) throw new RuntimeException("性别名称不能为空!");
        for (SexType sexType : SexType.values()) {
            if (sexName.equals(sexType.getName())) {
                return sexType.getCode();
            }
        }
        throw new RuntimeException("无效的性别名称: " + sexName);
    }
}
