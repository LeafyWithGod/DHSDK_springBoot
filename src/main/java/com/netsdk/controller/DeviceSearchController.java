package com.netsdk.controller;

import com.netsdk.demo.module.DeviceSearchModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.lib.enumeration.EM_SEND_SEARCH_TYPE;
import com.netsdk.lib.structure.NET_IN_STARTSERACH_DEVICE;
import com.netsdk.lib.structure.NET_OUT_STARTSERACH_DEVICE;
import com.netsdk.response.Result;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 设备搜索接口实现
 * 主要功能有 ： 设备组播和广播搜索、设备IP单播搜索
 */
@Api(value = "主要功能有 ： 设备组播和广播搜索、设备IP单播搜索",tags = "设备搜索controller")
@RestController
@RequestMapping("/deviceSearch")
public class DeviceSearchController {


    /**
     * 设备组播和广播搜索
     * @throws SocketException
     */
    @ApiOperation(value = "设备组播和广播搜索",notes = "设备组播和广播搜索")
    @GetMapping("/multiBroadcastDeviceSearch")
    public Result multiBroadcastDeviceSearch(NetSDKLib.fSearchDevicesCBEx cbSearchDevices, String szlocalIp){
        NetSDKLib.LLong lLong=null;
        try {
            lLong = DeviceSearchModule.multiBroadcastDeviceSearch(cbSearchDevices, szlocalIp);
        } catch (SocketException e) {
            e.printStackTrace();
        } finally {
            return lLong != null ? Result.ok() : Result.fail();
        }
    }

    /**
     * 停止设备组播和广播搜索
     */
    @ApiOperation(value = "停止设备组播和广播搜索",notes = "停止设备组播和广播搜索")
    @PostMapping("/stopDeviceSearch")
    public Result stopDeviceSearch(NetSDKLib.LLong m_DeviceSearchHandle) {
        DeviceSearchModule.stopDeviceSearch(m_DeviceSearchHandle);
        return Result.ok();
    }

    /**
     * 设备IP单播搜索
     * @param startIP 起始IP
     * @param nIpNum IP个数，最大 256
     * @throws SocketException
     */
    @ApiOperation(value = "设备IP单播搜索",notes = "设备IP单播搜索")
    @PostMapping("/unicastDeviceSearch")
    public Result unicastDeviceSearch(String localIp,String startIP, int nIpNum, NetSDKLib.fSearchDevicesCB cbSearchDevices){
        boolean bRet = false;
        try {
            bRet=DeviceSearchModule.unicastDeviceSearch(localIp,startIP,nIpNum,cbSearchDevices);
        } catch (SocketException e) {
            e.printStackTrace();
        }finally {
            return bRet ? Result.ok() : Result.fail();
        }
    }

    /**
     * 获取ip
     * @param ip
     * @param num
     * @return
     */
    @ApiOperation(value = "获取ip",notes = "获取ip")
    @GetMapping("/getIp")
    public Result getIp(String[] ip, int num) {
        return Result.ok(DeviceSearchModule.getIp(ip,num));
    }

    /**
     * 获取多网卡IP
     */
    @ApiOperation(value = "获取多网卡IP",notes = "获取多网卡IP")
    @GetMapping("/getHostAddress")
    public Result getHostAddress() {
        List<String> hostAddress=new ArrayList<>();
        try {
            hostAddress = DeviceSearchModule.getHostAddress();
        } catch (SocketException e) {
            e.printStackTrace();
        }finally {
            return Result.ok(hostAddress);
        }
    }
}
