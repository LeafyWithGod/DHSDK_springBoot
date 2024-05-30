package com.netsdk.controller;

import com.netsdk.demo.module.AutoRegisterModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * 自动注册controller
 */
@Api(value = "自动注册controller",tags = "自动注册controller")
@RestController
@RequestMapping("/autore")
public class AutoReController {
    
    
    
    /**
     * 开启服务
     * @param address 本地IP地址
     * @param port 本地端口, 可以任意
     * @param callback 回调函数
     */
    @ApiOperation(value = "开启服务",notes = "开启服务")
    @PostMapping("/startServer")
    public Result startServer(String address, int port, NetSDKLib.fServiceCallBack callback) {
        return AutoRegisterModule.startServer(address, port, callback) ? Result.ok() : Result.fail();
    }

    /**
     * 结束服务
     */
    @ApiOperation(value = "结束服务",notes = "结束服务")
    @PostMapping("/stopServer")
    public Result stopServer() {
        return AutoRegisterModule.stopServer() ? Result.ok() : Result.fail();
    }

    /**
     * 登录设备(主动注册登陆接口)
     * @param m_strIp  设备IP
     * @param m_nPort  设备端口号
     * @param m_strUser  设备用户名
     * @param m_strPassword  设备密码
     * @param deviceIds  设备ID
     * @return
     */
    @ApiOperation(value = "登录设备",notes = "登录设备")
    @PostMapping("/login")
    public Result login(String m_strIp, int m_nPort, String m_strUser, String m_strPassword, String deviceIds) {
        return Result.ok(AutoRegisterModule.login(m_strIp, m_nPort, m_strUser, m_strPassword, deviceIds));
    }

    /**
     * 登出设备
     * @param m_hLoginHandle  登陆句柄
     * @return
     */
    @ApiOperation(value = "登出设备",notes = "登出设备")
    @PostMapping("/logout")
    public Result logout(NetSDKLib.LLong m_hLoginHandle) {
        return Result.ok(AutoRegisterModule.logout(m_hLoginHandle));
    }

    /**
     * 开始预览
     * @param m_hLoginHandle 登陆句柄
     * @param channel  通道号
     * @param stream  码流类型
     * @param realPlayWindow  拉流窗口
     * @return
     */
    @ApiOperation(value = "开始预览",notes = "开始预览")
    @PostMapping("/startRealPlay")
    public Result startRealPlay(NetSDKLib.LLong m_hLoginHandle, int channel, int stream, Panel realPlayWindow) {
        return null;
    }

    /**
     * 停止预览
     * @param m_hPlayHandle 实时预览句柄
     * @return
     */
    @ApiOperation(value = "停止预览",notes = "停止预览")
    @PostMapping("/stopRealPlay")
    public Result stopRealPlay(NetSDKLib.LLong m_hPlayHandle) {
        return AutoRegisterModule.stopRealPlay(m_hPlayHandle) ? Result.ok() : Result.fail();
    }

    /**
     * 远程抓图
     * @param m_hLoginHandle 登陆句柄
     * @param chn  通道号
     * @return
     */
    @ApiOperation(value = "远程抓图",notes = "远程抓图")
    @PostMapping("/snapPicture")
    public Result snapPicture(NetSDKLib.LLong m_hLoginHandle, int chn) {
        return AutoRegisterModule.snapPicture(m_hLoginHandle, chn) ? Result.ok() : Result.fail();
    }

    /**
     *设置抓图回调函数， 图片主要在m_SnapReceiveCB中返回
     * @param m_SnapReceiveCB
     */
    @ApiOperation(value = "设置抓图回调函数， 图片主要在m_SnapReceiveCB中返回",notes = "设置抓图回调函数")
    @PostMapping("/setSnapRevCallBack")
    public Result setSnapRevCallBack(NetSDKLib.fSnapRev m_SnapReceiveCB){
       AutoRegisterModule.setSnapRevCallBack(m_SnapReceiveCB);
       return Result.ok();
    }

    /**
     * 获取网络协议
     * @param m_hLoginHandle 登录句柄
     * @return
     */
    @ApiOperation(value = "获取网络协议",notes = "获取网络协议")
    @PostMapping("/getDVRIPConfig")
    public Result getDVRIPConfig(NetSDKLib.LLong m_hLoginHandle) {
        return Result.ok(AutoRegisterModule.getDVRIPConfig(m_hLoginHandle));
    }

    /**
     * 网络协议配置
     * @param m_hLoginHandle 登陆句柄
     * @param enable  使能
     * @param address 服务器地址
     * @param nPort  服务器端口号
     * @param deviceId  设备ID
     * @param info 获取到的网络协议配置
     * @return
     */
    @ApiOperation(value = "网络协议配置",notes = "网络协议配置")
    @PostMapping("/setDVRIPConfig")
    public Result setDVRIPConfig(NetSDKLib.LLong m_hLoginHandle, boolean enable, String address, int nPort, byte[] deviceId, NetSDKLib.CFG_DVRIP_INFO info) {
        return AutoRegisterModule.setDVRIPConfig(m_hLoginHandle, enable, address, nPort, deviceId, info) ? Result.ok() : Result.fail();
    }

    /**
     * \if ENGLISH_LANG
     * Start Talk
     * \else
     * 开始通话
     * \endif
     */
    @ApiOperation(value = "开始通话",notes = "开始通话")
    @PostMapping("/startTalk")
    public Result startTalk(NetSDKLib.LLong m_hLoginHandle) {
        return AutoRegisterModule.startTalk(m_hLoginHandle) ? Result.ok() : Result.fail();
    }

    /**
     * \if ENGLISH_LANG
     * Stop Talk
     * \else
     * 结束通话
     * \endif
     */
    @ApiOperation(value = "结束通话",notes = "结束通话")
    @PostMapping("/stopTalk")
    public Result stopTalk(NetSDKLib.LLong m_hTalkHandle) {
        AutoRegisterModule.stopTalk(m_hTalkHandle);
        return Result.ok();
    }

}
