package com.bitzh.picturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * 图片标签分类列表视图
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/2 12:17
 */
@Data
public class PictureTagCategory {

    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;

}
