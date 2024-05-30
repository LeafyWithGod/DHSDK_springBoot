package com.netsdk.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 以图搜图接口实现，跟查询人脸库里的人员信息的查找接口是一样的，入参和实现有区别
 * 目前只支持IVSS
 */
@Api(value = "跟查询人脸库里的人员信息的查找接口是一样的，入参和实现有区别",tags = "以图搜图")
@RestController
@RequestMapping("/SearchPic")
public class SearchByPicController {
}
