package com.bitzh.picturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/21 14:14
 */
@Data
public class SearchPictureByColorRequest implements Serializable {

    /**
     * 图片主色调
     */
    private String picColor;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}

