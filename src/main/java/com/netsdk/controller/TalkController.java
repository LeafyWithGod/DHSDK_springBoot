package com.netsdk.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 语音对讲接口实现
 * 包含: 开始通话、结束通话、语音对讲的数据回调实现类
 */
@Api(value = "语音对讲",tags = "语音对讲controller")
@RestController
@RequestMapping("/Talk")
public class TalkController {
}
