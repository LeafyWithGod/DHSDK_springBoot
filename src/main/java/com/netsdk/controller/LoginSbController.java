package com.netsdk.controller;

import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.NetSDKLib.LLong;
import com.netsdk.lib.NetSDKLib.NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.netsdk.lib.NetSDKLib.NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * 登陆接口实现
 * 主要有 ：初始化、登陆、登出功能
 */
@Api(value = "主要有 ：初始化、登陆、登出功能",tags = "登陆设备接口")
@RestController
@RequestMapping("/LoginSb")
public class LoginSbController {

	/**
	 * \if ENGLISH_LANG
	 * Init
	 * \else
	 * 初始化
	 * \endif
	 */
	@ApiOperation(value = "初始化",notes = "初始化")
	@PostMapping("/init")
	public Result init(NetSDKLib.fDisConnect disConnect, NetSDKLib.fHaveReConnect haveReConnect) {
		return null;
	}
	
	/**
	 * \if ENGLISH_LANG
	 * CleanUp
	 * \else
	 * 清除环境
	 * \endif
	 */
	@ApiOperation(value = "清除环境",notes = "清除环境")
	@PostMapping("/cleanup")
	public Result cleanup() {
		return null;
	}

	/**
	 * \if ENGLISH_LANG
	 * Login Device
	 * \else
	 * 登录设备
	 * \endif
	 */
	@ApiOperation(value = "登录设备",notes = "登录设备")
	@PostMapping("/login")
	public Result login(String m_strIp, int m_nPort, String m_strUser, String m_strPassword) {
		return null;
	}
	
	/**
	 * \if ENGLISH_LANG
	 * Logout Device
	 * \else
	 * 登出设备
	 * \endif
	 */
	@ApiOperation(value = "登出设备",notes = "登出设备")
	@PostMapping("/logout")
	public Result logout() {
		return null;
	}
}
