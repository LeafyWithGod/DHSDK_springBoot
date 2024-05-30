package com.netsdk.controller;

import com.netsdk.demo.module.AlarmListenModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 报警接口
 * 包含 ：向设备订阅报警和停止订阅报警
 */
@RestController
@RequestMapping("/alarm")
@Api(value = "向设备订阅报警和停止订阅报警",tags = "报警controller")
public class AlarmController {

    /**
     * 向设备订阅报警
     * @param cbMessage
     * @return
     */
    @ApiOperation(value = "向设备订阅报警",notes = "订阅报警")
    @PostMapping("/startListen")
    public Result startListen(NetSDKLib.fMessCallBack cbMessage) {
        return AlarmListenModule.startListen(cbMessage) ? Result.ok() : Result.fail();
    }

    /**
     * 停止订阅报警
     * @return
     */
    @ApiOperation(value = "停止订阅报警",notes = "停止订阅")
    @PostMapping("/stopListen")
    public Result stopListen() {
        return AlarmListenModule.stopListen() ? Result.ok() : Result.fail();
    }
}
