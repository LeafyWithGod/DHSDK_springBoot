package com.netsdk.controller;


import com.netsdk.demo.module.DeviceControlModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * 设备控制接口实现
 * 包含: 重启、时间同步、获取时间功能
 */
@Api(value = "包含: 重启、时间同步、获取时间功能",tags = "设备控制接口")
@RestController
@RequestMapping("/DeviceCt")
public class DeviceCtController {

    /**
     * 重启设备
     * @return
     */
    @ApiOperation(value = "重启设备",notes = "重启设备")
    @PostMapping("/reboot")
    public Result reboot() {
        return Result.ok(DeviceControlModule.reboot());
    }

    /**
     * 时间同步
     */
    @ApiOperation(value = "时间同步",notes = "时间同步")
    @PostMapping("/setTime")
    public Result setTime(String date) {
        return Result.ok(DeviceControlModule.setTime(date));
    }

    /**
     * 获取设备当前时间
     */
    @ApiOperation(value = "获取设备当前时间",notes = "获取设备当前时间")
    @GetMapping("/getTime")
    public Result getTime() {
        return Result.ok(DeviceControlModule.getTime());
    }
}
