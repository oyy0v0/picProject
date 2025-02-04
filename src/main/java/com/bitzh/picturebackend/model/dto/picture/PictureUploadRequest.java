package com.bitzh.picturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/1 12:24
 */
@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

