package com.netsdk.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 智能交通接口实现
 * 主要有 ：智能订阅、开闸、关闸功能
 */
@Api(value = "主要有 ：智能订阅、开闸、关闸功能",tags = "智能交通controller")
@RestController
@RequestMapping("/Traffic")
public class TrafficController {
}
