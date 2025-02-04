package com.bitzh.picturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的删除请求类
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/22 11:09
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
