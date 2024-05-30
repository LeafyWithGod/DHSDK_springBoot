package com.netsdk.common;


import lombok.Getter;

/**
 * HTTP Restful Api 错误枚举
 *
 * @author lingjiatong
 * Date: 2020/7/7 10:39 上午
 */
@Getter
public enum ErrorEnum {

    //#################### 400异常 ####################//

    /**
     * 请求参数为空 ｜ 请求参数格式有误
     */
    REQUEST_PARAM_ERROR("请求参数有误"),

    /**
     * 参数值不在合法的范围内
     */
    ILLEGAL_PARAM_ERROR("异常的参数值"),

    /**
     * 请求对象不存在
     */
    RESOURCE_NOT_EXIST_ERROR("请求资源不存在"),

    /**
     * 请求资源已存在
     */
    RESOURCE_ALREADY_EXIST_ERROR("资源已存在"),

    //#################### 权限相关异常 ####################//

    /**
     * 禁止访问
     */
    PERMISSION_DENIED_ERROR("禁止访问"),


    //#################### 500服务器异常 ####################//

    /**
     * 通用系统异常消息
     */
    COMMON_SERVER_ERROR("系统异常，操作失败"),

    /**
     * 文件服务器出现异常
     */
    FILE_SERVER_ERROR("文件服务器异常，上传失败"),

    /**
     * 数据操作失败
     */
    DATABASE_OPERATION_ERROR("数据库操作失败"),

    /**
     * 获取系统信息异常
     */
    SYSTEM_MONITOR_ERROR("获取系统信息异常"),


    //#################### 600 业务类异常 ####################//


    //#################### 未知异常信息 ####################//

    /**
     * 未知系统异常
     */
    UNKNOWN_ERROR("未知系统异常"),

    //#################### 原项目异常信息 ####################//
    FILE_EXCPETION("不允许的文件"),

    FAIL_TIME("请求超时"),

    FAIL_REQ("请求失败"),

    //参数异常
    PARMETER_EXCEPTION("参数异常！"),
    //等待超时
    SERVICE_TIME_OUT("服务调用超时！"),
    //参数过大
    PARMETER_BIG_EXCEPTION("输入的图片数量不能超过50张！"),
    //500：Exception的提示也可以在这定义
    UNEXPECTED_EXCEPTION("系统异常"),

    TOKEN_NO_HAVE("无token值，请先登录"),

    TOKEN_NO_HAVE2("用户不存在"),

    TOKEN_EX("token无效"),

    TOKEN_ERROR("越权访问"),

    IP_EX("非白名单禁止访问系统"),

    TIME_EX("当前访问不在时间段内"),

    //弱口令
    ERROR_PWD("密码复杂度不符合要求"),


    //请求未加密
    SM4_EXCEPTION("国密加密失败"),
    PARMETER_SM4_EXCEPTION("参数未加密");


    ;


    /**
     * 错误信息
     */
    private final String message;

    ErrorEnum(String message) {
        this.message = message;
    }
}
