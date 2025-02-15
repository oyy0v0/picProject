package com.bitzh.picturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bitzh.picturebackend.model.dto.picture.*;
import com.bitzh.picturebackend.model.entity.Picture;
import com.bitzh.picturebackend.model.entity.User;
import com.bitzh.picturebackend.model.vo.PictureVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 29258
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-02-01 12:14:54
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param inputSource 图片源
     * @param pictureUploadRequest 上传请求
     * @param loginUser 当前登录用户
     * @return 图片
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 获取查询条件
     * @param pictureQueryRequest 查询请求
     * @return 查询条件
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);


    /**
     * 获取图片包装类（单条）
     * @param picture 图片
     * @param request 请求
     * @return 包装类
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 获取图片包装类（分页）
     * @param picturePage 分页
     * @param request 请求
     * @return 分页包装类
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 校验图片
     * @param picture 待校验图片
     */
    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest 审核请求
     * @param loginUser 当前登录用户
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);


    /**
     * 填充审核参数
     * @param picture 待审核图片
     * @param loginUser 当前登录用户
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest 抓取图片请求
     * @param loginUser 当前登录用户
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
        PictureUploadByBatchRequest pictureUploadByBatchRequest,
        User loginUser
    );

    /**
     * 清除图片
     * @param oldPicture 旧图片
     */
    void clearPictureFile(Picture oldPicture);

    /**
     * 删除图片
     * @param pictureId 图片 id
     * @param loginUser 当前登录用户
     */
    void deletePicture(long pictureId, User loginUser);

    /**
     * 编辑图片
     * @param pictureEditRequest 编辑请求
     * @param loginUser 当前登录用户
     */
    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);

    /**
     * 检查空间图片权限
     * @param loginUser 当前登录用户
     * @param picture 图片
     */
    void checkPictureAuth(User loginUser , Picture picture);

}
