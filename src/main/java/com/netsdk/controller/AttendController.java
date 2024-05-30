package com.netsdk.controller;

import com.netsdk.demo.module.AttendanceModule;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.ToolKits;
import com.netsdk.response.Result;
import com.sun.jna.Memory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 考勤机接口实现
 * 包含: 智能订阅、考勤用户及信息的增删改查、信息采集
 */
@Api(value = "智能订阅、考勤用户及信息的增删改查、信息采集",tags = "考勤机controller")
@RestController
@RequestMapping("/attend")
public class AttendController {

    /**
     * 智能订阅
     * @param callback   智能订阅回调函数
     */
    @ApiOperation(value = "智能订阅",notes = "智能订阅")
    @PostMapping("/realLoadPicture")
    public Result realLoadPicture(NetSDKLib.fAnalyzerDataCallBack callback){
        return AttendanceModule.realLoadPicture(callback) ? Result.ok() : Result.fail();
    }

    /**
     * 停止智能订阅
     */
    @ApiOperation(value = "停止智能订阅",notes = "停止智能订阅")
    @PostMapping("/stopRealLoadPicture")
    public Result stopRealLoadPicture(){
        AttendanceModule.stopRealLoadPicture();
        return Result.ok();
    }

    /**
     * 考勤新增加用户
     * @param userId   用户ID
     * @param userName 用户名
     * @param cardNo   卡号
     */
    @ApiOperation(value = "添加考勤用户",notes = "添加考勤用户")
    @PostMapping("/addUser")
    public Result addUser(String userId, String userName, String cardNo){
        return AttendanceModule.addUser(userId, userName, cardNo) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤删除用户
     * @param userId   用户ID
     */
    @ApiOperation(value = "删除考勤用户",notes = "删除考勤用户")
    @PostMapping("/deleteUser")
    public Result deleteUser(String userId){
        return AttendanceModule.deleteUser(userId) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤修改用户
     * @param userId   用户ID
     * @param userName 用户名
     * @param cardNo   卡号
     */
    @ApiOperation(value = "修改考勤用户",notes = "修改考勤用户")
    @PostMapping("/modifyUser")
    public Result modifyUser(String userId, String userName, String cardNo){
        return AttendanceModule.modifyUser(userId, userName, cardNo) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤机  通过用户ID插入信息数据
     * @param userId   			用户ID
     * @param szFingerPrintInfo 信息信息
     */
    @ApiOperation(value = "通过用户ID插入信息数据",notes = "插入信息数据")
    @PostMapping("/insertFingerByUserId")
    public Result insertFingerByUserId(String userId, byte[] szFingerPrintInfo){
        return AttendanceModule.insertFingerByUserId(userId, szFingerPrintInfo) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤机 查找用户
     * @param nOffset   		查询偏移
     * @param nPagedQueryCount 	查询个数
     * @return UserData[] 		用户信息组
     */
    @ApiOperation(value = "考勤机查找用户")
    @GetMapping("/findUser")
    public Result  findUser(int nOffset, int nPagedQueryCount){
        AttendanceModule.UserData[] user = AttendanceModule.findUser(nOffset, nPagedQueryCount);
        return Result.ok(user);
    }

    /**
     * 考勤获取用户信息
     * @param userId   	用户ID
     * @return UserData 用户信息
     */
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    @GetMapping("/getUser")
    public Result getUser(String userId) {
        return Result.ok(AttendanceModule.getUser(userId));
    }

    /**
     * 考勤机 删除单个用户下所有信息数据
     * @param userId   用户ID
     */
    @ApiOperation(value = "删除单个用户下所有信息数据",notes = "删除单个用户下所有信息数据")
    @PostMapping("/removeFingerByUserId")
    public Result removeFingerByUserId(String userId) {
        return AttendanceModule.removeFingerByUserId(userId) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤机 通过信息ID删除信息数据
     * @param nFingerPrintID  信息ID
     */
    @ApiOperation(value = "通过信息ID删除信息数据",notes = "通过信息ID删除信息数据")
    @PostMapping("/removeFingerRecord")
    public Result removeFingerRecord(int nFingerPrintID) {
        return AttendanceModule.removeFingerRecord(nFingerPrintID) ? Result.ok() : Result.fail();
    }

    /**
     * 考勤机 通过信息ID获取信息数据
     * @param nFingerPrintID  信息ID
     * @return userData 用户数据
     */
    @ApiOperation(value = "通过信息ID获取信息数据",notes = "通过信息ID获取信息数据")
    @GetMapping("/getFingerRecord")
    public Result getFingerRecord(int nFingerPrintID) {
        return Result.ok(AttendanceModule.getFingerRecord(nFingerPrintID));
    }

    /**
     * 考勤机 通过用户ID查找该用户下的所有信息数据
     * @param userId   用户ID
     * @param userData 用户数据
     */
    @ApiOperation(value = "通过用户ID查找该用户下的所有信息数据",notes = "通过用户ID查找该用户下的所有信息数据")
    @GetMapping("/getFingerByUserId")
    public Result getFingerByUserId(String userId, AttendanceModule.UserData userData) {
        return AttendanceModule.getFingerByUserId(userId, userData) ? Result.ok() : Result.fail();
    }

    /**
     * 信息采集
     * @param nChannelID   门禁序号
     * @param szReaderID   读卡器ID
     */
    @ApiOperation(value = "信息采集",notes = "信息采集")
    @PostMapping("/collectionFinger")
    public Result collectionFinger(int nChannelID, String szReaderID) {
        return AttendanceModule.collectionFinger(nChannelID, szReaderID) ? Result.ok() : Result.fail();
    }
    
}
