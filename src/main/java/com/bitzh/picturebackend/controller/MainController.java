package com.bitzh.picturebackend.controller;

import com.bitzh.picturebackend.common.BaseResponse;
import com.bitzh.picturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oyy0v0
 * @version 1.0.0
 * @create 2025/1/22 12:04
 */
@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}

