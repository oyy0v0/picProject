package com.bitzh.picturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * 空间创建请求
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/14 2:48
 */

@Data
public class SpaceAddRequest implements Serializable {

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     * 空间级别：0-普通版 1-专业版 2-旗舰版
     */
    private Integer spaceLevel;



    private static final long serialVersionUID = 1L;
}

