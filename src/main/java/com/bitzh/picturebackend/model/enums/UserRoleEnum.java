package com.bitzh.picturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * 用户角色枚举
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/25 11:00
 */
@Getter
public enum UserRoleEnum {

    USER("用户","user"),
    ADMIN("管理员","admin");


    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据value获取枚举
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if(ObjUtil.isEmpty(value)){
            return null;
        }
        for(UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            if(userRoleEnum.value.equals(value)){
                return userRoleEnum;
            }
        }
        return null;
    }
}
