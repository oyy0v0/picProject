package com.bitzh.picturebackend.common;

import lombok.Data;

/**
 * 通用的分页请求类
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/21 22:50
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序(默认升序)
     */
    private String sortOrder = "descend";





}
