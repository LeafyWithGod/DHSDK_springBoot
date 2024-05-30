package com.netsdk.controller;

import com.netsdk.demo.module.DownLoadRecordModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import com.sun.jna.ptr.IntByReference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 下载录像接口实现
 * 主要有 ： 查询录像、下载录像、设置码流类型功能
 */
@Api(value = "主要有 ： 查询录像、下载录像、设置码流类型功能",tags = "下载录像controller")
@RestController
@RequestMapping("/DownLoadRecord")
public class DownLoadController {

    /**
     * 查找录像文件
     * @param nChannelId
     * @param stTimeStart
     * @param stTimeEnd
     * @param stFileInfo
     * @param nFindCount
     * @return
     */
    @ApiOperation(value = "查找录像文件",notes = "查找录像文件")
    @GetMapping("/queryRecordFile")
    public Result queryRecordFile(int nChannelId,
                                  NetSDKLib.NET_TIME stTimeStart,
                                  NetSDKLib.NET_TIME stTimeEnd,
                                  NetSDKLib.NET_RECORDFILE_INFO[] stFileInfo,
                                  IntByReference nFindCount) {
        return DownLoadRecordModule.queryRecordFile(nChannelId, stTimeStart, stTimeEnd, stFileInfo, nFindCount) ? Result.ok() : Result.fail();
    }

    /**
     *  设置回放时的码流类型
     * @param m_streamType 码流类型
     */
    @ApiOperation(value = "设置回放时的码流类型",notes = "设置回放时的码流类型")
    @PostMapping("/setStreamType")
    public Result setStreamType(int m_streamType) {
        DownLoadRecordModule.setStreamType(m_streamType);
        return Result.ok();
    }

    @ApiOperation(value = "下载录像文件",notes = "下载录像文件")
    @GetMapping("/downloadRecordFile")
    public Result downloadRecordFile(int nChannelId,
                                                     int nRecordFileType,
                                                     NetSDKLib.NET_TIME stTimeStart,
                                                     NetSDKLib.NET_TIME stTimeEnd,
                                                     String SavedFileName,
                                                     NetSDKLib.fTimeDownLoadPosCallBack cbTimeDownLoadPos) {
        return Result.ok(DownLoadRecordModule.downloadRecordFile(nChannelId, nRecordFileType, stTimeStart, stTimeEnd, SavedFileName, cbTimeDownLoadPos));
    }

    /**
     * 该函数用于停止下载记录文件
     * @param m_hDownLoadHandle
     */
    @ApiOperation(value = "该函数用于停止下载记录文件",notes = "该函数用于停止下载记录文件")
    @GetMapping("/stopDownLoadRecordFile")
    public Result stopDownLoadRecordFile(NetSDKLib.LLong m_hDownLoadHandle) {
        DownLoadRecordModule.stopDownLoadRecordFile(m_hDownLoadHandle);
        return Result.ok();
    }
}
