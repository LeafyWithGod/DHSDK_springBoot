package com.netsdk.controller;

import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import com.sun.jna.Memory;
import com.sun.jna.ptr.IntByReference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 人脸开门(人脸闸机)
 */
@Api(value = "人脸开门(人脸闸机)",tags = "人脸开门(人脸闸机)")
@RestController
@RequestMapping("/Gate")
public class GateController {


    /**
     * 订阅实时上传智能分析数据
     * @return
     */
    @ApiOperation(value = "订阅实时上传智能分析数据",notes = "订阅实时上传智能分析数据")
    @PostMapping("/realLoadPic")
    public Result realLoadPic(int ChannelId, NetSDKLib.fAnalyzerDataCallBack m_AnalyzerDataCB) {
        return null;
    }

    /**
     * 停止上传智能分析数据－图片
     */
    @ApiOperation(value = "停止上传智能分析数据－图片",notes = "停止上传智能分析数据－图片")
    @PostMapping("/stopRealLoadPic")
    public Result stopRealLoadPic(NetSDKLib.LLong m_hAttachHandle) {
        return null;
    }

    //////////////////////////////////////  卡信息的增、删、改、清空  ////////////////////////////////////////

    /**
     * 添加卡
     * @param cardNo  	  卡号
     * @param userId  	  用户ID
     * @param cardName   卡名
     * @param cardPwd    卡密码
     * @param cardStatus 卡状态
     * @param cardType   卡类型
     * @param useTimes   使用次数
     * @param isFirstEnter  是否首卡, 1-true, 0-false
     * @param isValid  		是否有效, 1-true, 0-false
     * @param startValidTime  有效开始时间
     * @param endValidTime    有效结束时间
     * @return true:成功   false:失败
     */
    @ApiOperation(value = "添加卡",notes = "添加卡")
    @PostMapping("/insertCard")
    public Result insertCard(String cardNo, String userId, String cardName, String cardPwd,
                                     int cardStatus, int cardType, int useTimes, int isFirstEnter,
                                     int isValid, String startValidTime, String endValidTime) {
        return null;
    }

    /**
     * 修改卡信息
     * @param recordNo   记录集编号
     * @param cardNo  	  卡号
     * @param userId  	  用户ID
     * @param cardName   卡名
     * @param cardPwd    卡密码
     * @param cardStatus 卡状态
     * @param cardType   卡类型
     * @param useTimes   使用次数
     * @param isFirstEnter  是否首卡, 1-true, 0-false
     * @param isValid  		是否有效, 1-true, 0-false
     * @param startValidTime  有效开始时间
     * @param endValidTime    有效结束时间
     * @return true:成功   false:失败
     */
    @ApiOperation(value = "修改卡信息",notes = "修改卡信息")
    @PostMapping("/modifyCard")
    public Result modifyCard(int recordNo, String cardNo, String userId, String cardName, String cardPwd,
                                     int cardStatus, int cardType, int useTimes, int isFirstEnter,
                                     int isValid, String startValidTime, String endValidTime) {
        return null;
    }

    /**
     * 删除卡信息(单个删除)
     * @param recordNo 记录集编号
     */
    @ApiOperation(value = "删除卡信息(单个删除)",notes = "删除卡信息(单个删除)")
    @PostMapping("/deleteCard")
    public Result deleteCard(int recordNo) {
        return null;
    }

    /**
     * 清除所有卡信息
     */
    @ApiOperation(value = "清除所有卡信息",notes = "清除所有卡信息")
    @PostMapping("/clearCard")
    public Result clearCard() {
        return null;
    }


    /////////////////////////////////  人脸的增、删、改、清空   ///////////////////////////////////////

    /**
     * 添加人脸
     * @param userId 用户ID
     * @param memory 图片缓存
     * @return
     */
    @ApiOperation(value = "添加人脸",notes = "添加人脸")
    @PostMapping("/addFaceInfo")
    public Result addFaceInfo(String userId, Memory memory) {
        return null;
    }

    /**
     * 修改人脸
     * @param userId 用户ID
     * @param memory 图片缓存
     * @return
     */
    @ApiOperation(value = "修改人脸",notes = "修改人脸")
    @PostMapping("/modifyFaceInfo")
    public Result modifyFaceInfo(String userId, Memory memory) {
        return null;
    }

    /**
     * 删除人脸(单个删除)
     * @param userId 用户ID
     */
    @ApiOperation(value = "删除人脸(单个删除)",notes = "删除人脸(单个删除)")
    @PostMapping("/deleteFaceInfo")
    public Result deleteFaceInfo(String userId) {
        return null;
    }

    /**
     * 清除所有人脸
     */
    @ApiOperation(value = "清除所有人脸",notes = "清除所有人脸")
    @PostMapping("/clearFaceInfo")
    public Result clearFaceInfo() {
        return null;
    }

    /**
     * 查询卡信息，获取查询句柄
     * @param cardNo 卡号，为空，查询所有的
     * @return
     */
    @ApiOperation(value = "查询卡信息，获取查询句柄",notes = "查询卡信息，获取查询句柄")
    @GetMapping("/findCard")
    public Result findCard(String cardNo) {
        return null;
    }

    /**
     * 查询具体的卡信息
     * @param nFindCount 每次查询的个数
     * @return 返回具体的查询信息
     */
    @ApiOperation(value = "查询具体的卡信息",notes = "查询具体的卡信息")
    @GetMapping("/findNextCard")
    public Result findNextCard(int nFindCount) {

        return null;
    }

    /**
     * 关闭查询
     */
    @ApiOperation(value = "关闭查询",notes = "关闭查询")
    @GetMapping("/findCardClose")
    public Result findCardClose() {
        return null;
    }
}
