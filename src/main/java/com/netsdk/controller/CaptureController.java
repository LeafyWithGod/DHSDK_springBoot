package com.netsdk.controller;

import com.netsdk.demo.module.CapturePictureModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 抓图接口实现
 * 包含: 本地、远程、定时和停止抓图
 */
@Api(value = "本地、远程、定时和停止抓图",tags = "抓图controller")
@RestController
@RequestMapping("capture")
public class CaptureController {

    /**
     * 本地抓图
	 */
    @ApiOperation(value = "本地抓图",notes = "本地抓图")
    @PostMapping("/localCapturePicture")
    public Result localCapturePicture(NetSDKLib.LLong hPlayHandle, String picFileName) {
        return CapturePictureModule.localCapturePicture(hPlayHandle, picFileName)?Result.ok() : Result.fail();
    }
    //TODO 抓图接口
}
