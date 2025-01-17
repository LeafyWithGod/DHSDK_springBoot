package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;

public class NET_RAID_MEMBER_INFO extends NetSDKLib.SdkStructure {
    public int              dwSize;
    public int              dwID;                                 // 磁盘号, 可用于描述磁盘在磁柜的槽位
    public int              bSpare;                               // 是否局部热备, true-局部热备, false-RAID子盘

	public NET_RAID_MEMBER_INFO() {
		this.dwSize = this.size();
		
		//System.out.println("NET_RAID_MEMBER_INFO " + this.size());
	}
}

