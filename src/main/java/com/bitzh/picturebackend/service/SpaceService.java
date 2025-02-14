package com.bitzh.picturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bitzh.picturebackend.model.dto.space.SpaceAddRequest;
import com.bitzh.picturebackend.model.dto.space.SpaceQueryRequest;
import com.bitzh.picturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bitzh.picturebackend.model.entity.User;
import com.bitzh.picturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 29258
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-02-14 02:30:03
*/
public interface SpaceService extends IService<Space> {

    

    /**
     * 获取查询条件
     * @param spaceQueryRequest 查询请求
     * @return 查询条件
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);


    /**
     * 获取空间包装类（单条）
     * @param space 空间
     * @param request 请求
     * @return 包装类
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     * @param spacePage 分页
     * @param request 请求
     * @return 分页包装类
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 校验空间
     * @param space 待校验空间
     */
    void validSpace(Space space, boolean add);

    /**
     * 根据空间级别填充空间
     * @param space 待填充空间
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 添加空间
     * @param spaceAddRequest 空间添加请求
     * @param loginUser 登录用户
     * @return 新空间 id
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
}
