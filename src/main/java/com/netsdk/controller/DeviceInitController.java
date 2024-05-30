package com.netsdk.controller;

import com.netsdk.demo.module.DeviceInitModule;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 设备初始化接口实现
 */
@Api(value = "设备初始化controller",tags = "设备初始化controller")
@RestController
@RequestMapping("/deviceInit")
public class DeviceInitController {

    /**
     * 设备初始化
     * @param localIp
     * @param szMac
     * @param password
     * @param cellPhone_mail
     * @param byPwdResetWay
     * @return
     */
    @ApiOperation(value = "设备初始化",notes = "设备初始化")
    @PostMapping("/initDevAccount")
    public Result initDevAccount(String localIp,String szMac, String password, String cellPhone_mail, byte byPwdResetWay){
        return Result.ok(DeviceInitModule.initDevAccount(localIp,szMac,password,cellPhone_mail,byPwdResetWay));
    }
}
