package com.bitzh.picturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bitzh.picturebackend.model.dto.user.UserQueryRequest;
import com.bitzh.picturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bitzh.picturebackend.model.vo.LoginUserVO;
import com.bitzh.picturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 29258
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-25 11:03:25
*/
public interface UserService extends IService<User> {

    /**
     *
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密后的密码
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获得脱敏后的登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获得脱敏后的用户信息
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获得脱敏后的用户信息列表
     * @param userList
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);


    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 用户注销
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 是否为管理员
     * @param loginUser
     * @return
     */
    boolean isAdmin(User loginUser);
}
