package com.netsdk.common;

/**
 * 通用常量信息
 *
 * @author zks
 * Date: 2023/08/14 10:39
 */
public interface CommonConstants {

    /**
     * 通用成功响应码
     */
    Integer SUCCESS = 200;
    /**
     * 通用失败响应码
     */
    Integer FAIL = 500;

    /**
     * 图片文件校验
     */
    String[] FILE_IMAGE_TYPE = {".png",".jpg",".jpeg"};
    /**
     * 手机号验证正则
     */
    String PHONE_VALID_REGEX = "^1[345789][0-9]{9}$";
    /**
     * 邮箱验证正则
     */
    String EMAIL_VALID_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    /**
     * 身份证验证正则
     */
    String CREDIT_VALID_REGEX = "^(^\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";

    /**
     * 密码校验正则表达式(数字，大小写字母，符号至少三种组合，不能有空格)
     */
    String PASSWORD_VALID_REGEX = "^(?=(.*[a-z]|.*[A-Z]))(?=(.*[@#$%^&+=_!]))(?=(.*[0-9]))[^\\s]*$";
    /**
     * 实体状态 - 正常
     */
    Integer ENTITY_NORMAL = 1;
    /**
     * 实体状态 - 删除
     */
    Integer ENTITY_DELETE = 0;
    /**
     * 开关 - 开
     */
    Integer SWITCH_ON = 1;
    /**
     * 开关 - 关
     */
    Integer SWITCH_OFF = 0;

    String RES_TYPE_CATEGORY = "05011";



    //==================== 字典编码相关 ====================//

    /**
     * 设备 - 逆变器
     */
    String EQUIPMENT_INVERTER = "0500301";

    /**
     * 设备 - 变流器
     */
    String EQUIPMENT_CONVERTER = "0500302";

    //==================== 采集平台设备编码相关 ====================//



    //==================== websocket消息通知相关 ====================//

    /**
     * websocket - 新能源监测
     */
    String WEBSOCKET_MODULE_NEW_ENERGY = "0503202";


    //==================== 采集平台信号量编码相关 ====================//


    /**
     * 采集信号 - 今日发电量
     */
    String SEMAPHORES_TODAY_POWER_GENERATION = "0119";

    /**
     * 采集信号 - 总发电量
     */
    String SEMAPHORES_TOTAL_POWER_GENERATION = "0120";

    String SEMAPHORES_DAY_TABLE = "use_value_day";
    String SEMAPHORES_15M_TABLE = "use_value_15m";
    /**
     * 采集信号 - 逆变器实时功率
     */
    String SEMAPHORES_INVERTER_REAL_TIME_POWER = "0108";
    /**
     * 采集信号 - 逆变器运行状态
     */
    String SEMAPHORES_INVERTER_RUN_STATUS = "0100";


    /**
     * 采集信号 - 变流器实时功率
     */
    String SEMAPHORES_CONVERTER_REAL_TIME_POWER = "0014";

    /**
     * 采集信号 - 变流器运行状态
     */
    String SEMAPHORES_CONVERTER_RUN_STATUS = "0100";

    /**
     * 设备 - 是虚拟设备
     */
    Integer EQUIPMENT_IS_SUMMARY = 1;

    /**
     * 设备 - 不是虚拟设备
     */
    Integer EQUIPMENT_NOT_SUMMARY = 0;


    /**
     * 日期时间格式
     */
    String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期格式
     */
    String DATE_FORMAT = "yyyy-MM-dd";

}
