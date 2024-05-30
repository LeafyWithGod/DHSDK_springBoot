package com.netsdk.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实时预览接口实现
 * 主要有 ：开始拉流、停止拉流功能
 */
@Api(value = "主要有 ：开始拉流、停止拉流功能",tags = "实时预览接口实现")
@RestController
@RequestMapping("/RealPlay")
public class RealPlayController {
}
