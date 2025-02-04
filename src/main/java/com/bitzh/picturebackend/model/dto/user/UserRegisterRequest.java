package com.bitzh.picturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/25 22:20
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -756551236143262378L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;


}
