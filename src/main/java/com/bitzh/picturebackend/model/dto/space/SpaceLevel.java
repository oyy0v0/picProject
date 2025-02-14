package com.bitzh.picturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 空间级别
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/2/14 17:11
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    /**
     * 0-普通版 1-专业版 2-旗舰版
     */
    private int value;

    /**
     * 空间级别名称
     */
    private String text;

    /**
     * 最大数量
     */
    private long maxCount;

    /**
     * 最大容量
     */
    private long maxSize;
}

