package com.netsdk.controller;

import com.netsdk.demo.module.DotmatrixScreenModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制点阵屏显示，根据给定的类型和设置信息进行配置
 */
@Api(value = "根据给定的类型和设置信息进行配置",tags = "控制点阵屏controller")
@RestController
@RequestMapping("/Dotmatrix")
public class DotmatrixController {

    /**
     * 向登录模块发送设备控制指令，以设置点阵屏的内容。
     * @param emType  指定控制类型
     * @param msg  点阵屏的设置信息
     * @return
     */
    @ApiOperation(value = "向登录模块发送设备控制指令，以设置点阵屏的内容。",notes = "向登录模块发送设备控制指令，以设置点阵屏的内容。")
    @RequestMapping("/setDotmatrixScreen")
    public Result setDotmatrixScreen(int emType, NetSDKLib.NET_CTRL_SET_PARK_INFO msg) {
        return DotmatrixScreenModule.setDotmatrixScreen(emType, msg)?Result.ok():Result.fail();
    }
}
