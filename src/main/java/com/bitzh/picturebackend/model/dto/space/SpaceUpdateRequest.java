package com.bitzh.picturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * 空间更新请求，给管理员使用，允许修改空间大小和限额，还有空间级别
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/14 2:50
 */
@Data
public class SpaceUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     * 空间级别：0-普通版 1-专业版 2-旗舰版
     */
    private Integer spaceLevel;

    /**
     * 空间图片的最大总大小
     */
    private Long maxSize;

    /**
     * 空间图片的最大数量
     */
    private Long maxCount;

    private static final long serialVersionUID = 1L;
}
