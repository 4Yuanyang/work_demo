package com.xyy.work.mapstruct;

import java.util.HashMap;
import java.util.Map;

public enum SexType {
    MAIL(1, "男"),
    FEMAIL(2, "女");

    private final int code;
    private final String name;
    private static final Map<Integer, SexType> codeMap = new HashMap<>(5);

    SexType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    static {
        for (SexType value : SexType.values()) {
            codeMap.put(value.code, value);
        }
    }

    public static SexType fromCode(int code) {
        SexType sexType = codeMap.get(code);
        if(sexType == null) {
            throw new RuntimeException("无效的性别编号!");
        }
        return sexType;
    }

    public String getName() {
        return this.name;
    }
    public int getCode() {
        return this.code;
    }

}
