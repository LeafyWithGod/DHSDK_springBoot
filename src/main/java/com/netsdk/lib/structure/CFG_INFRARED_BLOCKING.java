package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

/**
 * @author 260611
 * @description 红外阻断报警配置
 * @date 2023/03/31 11:19:01
 */
public class CFG_INFRARED_BLOCKING extends NetSDKLib.SdkStructure {
    /**
     * 使能
     */
    public int              bEnable;
    /**
     * 语音播报使能
     */
    public int              bVoiceBroadcastEnable;
    /**
     * 红外阻断持续时间, 取值范围：0-10，默认值为2
     */
    public int              nInfraredBlockingTime;
    /**
     * 时间间隔, 取值范围：0-65536，默认值为60
     */
    public int              nAlarmInterval;
    /**
     * 报警触发速度, 取值范围：0-200，默认值为30
     */
    public int              nAlarmSpeed;
    /**
     * 报警上报速度, 取值范围：0-200，默认值为30
     */
    public int              nAlarmReportSpeed;
    /**
     * 保留
     */
    public byte[]           byReserved = new byte[1024];

    public CFG_INFRARED_BLOCKING() {
    }
}
