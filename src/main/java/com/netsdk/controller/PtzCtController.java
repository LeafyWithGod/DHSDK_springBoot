package com.netsdk.controller;

import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 云台控制接口实现
 * 主要有 ：八个方向控制、变倍、变焦、光圈功能
 */
@Api(value = "主要有 ：八个方向控制、变倍、变焦、光圈功能",tags = "云台控制接口实现")
@RestController
@RequestMapping("/PtzCt")
public class PtzCtController {

    /**
     * 向上
     */
    @ApiOperation(value = "向上", notes = "启动向上移动")
    @PostMapping("/upStart")
    public Result ptzControlUpStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向上", notes = "停止向上移动")
    @PostMapping("/upEnd")
    public Result ptzControlUpEnd(int nChannelID) {
        return null;
    }

    /**
     * 向下
     */
    @ApiOperation(value = "向下", notes = "启动向下移动")
    @PostMapping("/downStart")
    public Result ptzControlDownStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向下", notes = "停止向下移动")
    @PostMapping("/downEnd")
    public Result ptzControlDownEnd(int nChannelID) {
        return null;
    }

    /**
     * 向左
     */
    @ApiOperation(value = "向左", notes = "启动向左移动")
    @PostMapping("/leftStart")
    public Result ptzControlLeftStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向左", notes = "停止向左移动")
    @PostMapping("/leftEnd")
    public Result ptzControlLeftEnd(int nChannelID) {
        return null;
    }

    /**
     * 向右
     */
    @ApiOperation(value = "向右", notes = "启动向右移动")
    @PostMapping("/rightStart")
    public Result ptzControlRightStart(int nChannelID, int lParam1,int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向右", notes = "停止启动向右移动")
    @PostMapping("/rightEnd")
    public Result ptzControlRightEnd(int nChannelID) {
        return null;
    }

    /**
     * 向左上
     */
    @ApiOperation(value = "向左上", notes = "启动向左上移动")
    @PostMapping("/leftUpStart")
    public Result ptzControlLeftUpStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向左上", notes = "停止向左上移动")
    @PostMapping("/leftUpEnd")
    public Result ptzControlLeftUpEnd(int nChannelID) {
        return null;
    }

    /**
     * 向右上
     */
    @ApiOperation(value = "向右上", notes = "启动向右上移动")
    @PostMapping("/rightUpStart")
    public Result ptzControlRightUpStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向右上", notes = "停止向右上移动")
    @PostMapping("/rightUpEnd")
    public Result ptzControlRightUpEnd(int nChannelID) {
        return null;
    }

    /**
     * 向左下
     */
    @ApiOperation(value = "向左下", notes = "启动向左下移动")
    @PostMapping("/leftDownStart")
    public Result ptzControlLeftDownStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向左下", notes = "停止向左下移动")
    @PostMapping("/leftDownEnd")
    public Result ptzControlLeftDownEnd(int nChannelID) {
        return null;
    }

    /**
     * 向右下
     */
    @ApiOperation(value = "向右下", notes = "启动向右下移动")
    @PostMapping("/rightDownStart")
    public Result ptzControlRightDownStart(int nChannelID, int lParam1, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止向右下", notes = "停止向右下移动")
    @PostMapping("/rightDownEnd")
    public Result ptzControlRightDownEnd(int nChannelID) {
        return null;
    }

    /**
     * 变倍+
     */
    @ApiOperation(value = "变倍+", notes = "变倍+")
    @PostMapping("/zoomAddStart")
    public Result ptzControlZoomAddStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止变倍+", notes = "停止变倍+")
    @PostMapping("/zoomAddEnd")
    public Result ptzControlZoomAddEnd(int nChannelID) {
        return null;
    }

    /**
     * 变倍-
     */
    @ApiOperation(value = "变倍-", notes = "变倍-")
    @PostMapping("/zoomDecStart")
    public Result ptzControlZoomDecStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止变倍-", notes = "停止变倍-")
    @PostMapping("/zoomDecEnd")
    public Result ptzControlZoomDecEnd(int nChannelID) {
        return null;
    }

    /**
     * 变焦+
     */
    @ApiOperation(value = "变焦+", notes = "变焦+")
    @PostMapping("/focusAddStart")
    public Result ptzControlFocusAddStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止变焦+", notes = "停止变焦+")
    @PostMapping("/focusAddEnd")
    public Result ptzControlFocusAddEnd(int nChannelID) {
        return null;
    }

    /**
     * 变焦-
     */
    @ApiOperation(value = "变焦-", notes = "变焦-")
    @PostMapping("/focusDecStart")
    public Result ptzControlFocusDecStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止变焦-", notes = "停止变焦-")
    @PostMapping("/focusDecEnd")
    public Result ptzControlFocusDecEnd(int nChannelID) {
        return null;
    }

    /**
     * 光圈+
     */
    @ApiOperation(value = "光圈+", notes = "光圈+")
    @PostMapping("/irisAddStart")
    public Result ptzControlIrisAddStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止光圈+", notes = "停止光圈+")
    @PostMapping("/irisAddEnd")
    public Result ptzControlIrisAddEnd(int nChannelID) {
        return null;
    }

    /**
     * 光圈-
     */
    @ApiOperation(value = "光圈-", notes = "光圈-")
    @PostMapping("/irisDecStart")
    public Result ptzControlIrisDecStart(int nChannelID, int lParam2) {
        return null;
    }
    @ApiOperation(value = "停止光圈-", notes = "停止光圈-")
    @PostMapping("/irisDecEnd")
    public Result ptzControlIrisDecEnd(int nChannelID) {
        return null;
    }
}
