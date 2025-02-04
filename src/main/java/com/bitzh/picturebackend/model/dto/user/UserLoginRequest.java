package com.bitzh.picturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/26 19:56
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -24007714097849039L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

}
