package com.netsdk.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IVSS 和 IPC-FR 人脸功能接口实现, IPC-FD只支持目标检测事件
 */
@Api(value = "IVSS 和 IPC-FR 人脸功能接口实现, IPC-FD只支持目标检测事件",tags = "IVSS 和 IPC-FR 人脸功能controller")
@RestController
@RequestMapping("/TargetRe")
public class TargetReController {
}
