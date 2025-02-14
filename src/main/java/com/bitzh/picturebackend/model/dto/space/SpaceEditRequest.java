package com.bitzh.picturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * 空间编辑请求，目前只支持编辑空间名称（给用户使用）
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/14 2:49
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    private static final long serialVersionUID = 1L;
}

