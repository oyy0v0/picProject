package com.bitzh.picturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/1 12:24
 */
@Data
public class PictureUploadByBatchRequest {


    /**
     * 名称前缀
     */
    private String namePrefix;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 抓取数量
     */
    private Integer count = 10;
}


