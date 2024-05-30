package com.netsdk.demo.module;

import com.netsdk.lib.NetSDKLib.NET_CTRL_SET_PARK_INFO;

public class DotmatrixScreenModule {

	/**
	 * 向登录模块发送设备控制指令，以设置点阵屏的内容。
	 * @param emType  指定控制类型
	 * @param msg  点阵屏的设置信息
	 * @return
	 */
	
	public static boolean setDotmatrixScreen(int emType, NET_CTRL_SET_PARK_INFO msg) {
		
		boolean ret = LoginModule.netsdk.CLIENT_ControlDevice(LoginModule.m_hLoginHandle, emType, msg.getPointer(), 3000);
		
		return ret;	
	}
}
