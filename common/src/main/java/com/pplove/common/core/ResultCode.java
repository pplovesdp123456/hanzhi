package com.pplove.common.core;

/**
 * 响应码枚举
 */
public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS(0,"成功"),

    /**********************************************************************************
     ********系统级异常响应码，包括web服务器错误、数据库异常，与具体业务无关(10开头)***************
     ***********************************************************************************/
    SYS_ERROR(10_0001,"系统异常"),
    SYS_DATABASE_ERROR(10_0002,"数据库异常"),
    SYS_FILE_IO_ERROR(10_0003,"文件流读取异常"),
    SYS_CONFIG_ERROR(10_0004,"系统配置异常"),
    SYS_INTERFACE_NO_FOUND_ERROR(10_0005,"系统不存在此接口"),
    SYS_FILE_NAME_EMPTY(10_0006,"文件名为空,创建失败"),
    SYS_FILE_EMPTY(10_0007,"文件为空,上传失败"),
    SYS_FILE_URL_EMPTY(10_0008,"文件路径为空，无法处理"),
    SYS_DB_MYBATIS_ERROR(10_0009,"myBatis操作数据库出错，具体错误原因请查看本地日志"),
    SYS_DB_TK_MAPPER_ERROR(10_0010,"tk操作数据库出错，具体错误原因请查看本地日志"),
    SYS_UNAUTHORIZED(10_0011,"授权码失效或不存在，请联系管理员"),
    AUTHORIZATION_CODE_ERROR(10_0010,"授权码错误或已失效"),
    SYS_UNKNOWN_ERROR(10_9999,"未知系统错误"),

    /**********************************************************************************
     ********业务级公共异常响应码，包括非法登录、参数格式错误、json解析错误等(11开头)************
     *********************************************************************************/

    /**参数格式异常**/
    SERVICE_COMM_PARAMETER_ERROR(11_00_01,"参数格式错误"),
    SERVICE_COMM_PARAMETER_VALUE_EMPTY(11_00_02,"参数值不能为空"),

    /**数据操作异常**/
    SERVICE_COMM_DATA_EXISTED(11_01_01,"数据已存在"),
    SERVICE_COMM_OPERATION_DATA_NOT_EXIST(11_01_02,"操作的数据已不存在(包含删除、修改、查询等)"),
    SERVICE_COMM_ENABLE_DATA_UNABLE_TO_DELETE(11_01_03,"启用数据无法删除"),
    SERVICE_COMM_DATA_CORRELATION(11_01_04,"数据存在关联无法删除"),
    SERVICE_COMM_DATA_REPEAT(11_01_05,"存在重复数据"),

    /**安全相关异常**/
    SERVICE_COMM_SECURITY_NOT_LOGIN(11_02_01,"用户未登录系统"),
    SERVICE_COMM_SECURITY_USER_PASSWORD_ERROR(11_02_02,"用户名密码错误"),
    SERVICE_COMM_SECURITY_USER_TOO_MANY(11_02_03,"账号存在异常，请联系管理员处理"),
    SERVICE_COMM_SECURITY_USER_FORBIDEN(11_02_04,"账号已被禁用"),
    SERVICE_COMM_SECURITY_NO_AUTH(11_02_05,"你没有权限访问此接口"),
    SERVICE_COMM_SECURITY_ERROR(11_02_06,"认证鉴权出现错误"),
    SERVICE_COMM_SECURITY_TIMEOUT(11_02_07,"登录超时"),

    /**其他异常**/
    SERVICE_COMM_OTHER_JSON_ERROR(11_03_01,"JSON解析异常"),
    SERVICE_COMM_OTHER_JAVA_REFLECT_ERROR(11_03_02,"JAVA反射异常"),
    SERVICE_COMM_OTHER_XML_ERROR(11_03_03,"XML解析异常"),
    SERVICE_COMM_OTHER_HTML_ERROR(11_03_04,"HTML解析异常"),
    SERVICE_COMM_OTHER_DATA_ERROR(11_03_05,"数据异常"),
    SERVICE_COMM_OTHER_HTTP_REQUEST_ERROR(11_03_06,"HTTP请求异常");


    /**
     * 系统错误码最小值
     */
    public static final  int SYS_CODE_VALE_MIN = 10_0001;
    /**
     * 系统错误码最大值
     */
    public static final  int SYS_CODE_VALE_MAX = 10_9999;


    /**
     * 业务错误公共码最小值
     */
    public static final  int SERVICE_COMM_CODE_VALE_MIN = 11_00_01;
    /**
     * 业务错误公共码最大值
     */
    public static final  int SERVICE_COMM_CODE_VALE_MAX = 11_99_99;

    /**
     * 业务错误非公共码最小值
     */
    public static final  int SERVICE_NO_COMM_CODE_VALE_MIN = 21_00_0000;
    /**
     * 业务错误非公共码最大值
     */
    public static final  int SERVICE_NO_COMM_VALE_MAX = 99_99_9999;

    private final int code; //状态码
    private final String message; //返回消息

    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 判断是否为系统级错误码
     * @return
     */
    public boolean isSysError(){
        if(this.code >= SYS_CODE_VALE_MIN && this.code <= SYS_CODE_VALE_MAX){
            return true;
        }
        return false;
    }

    /**
     * 判断是否为业务公共错误码
     * @return
     */
    public boolean isServiceCommError(){
        if(this.code >= SERVICE_NO_COMM_CODE_VALE_MIN && this.code <= SERVICE_COMM_CODE_VALE_MAX){
            return true;
        }
        return false;
    }

    /**
     * 判断是否为业务公共非错误码
     * @return
     */
    public boolean isServiceNoCommError(){
        if(this.code >= SERVICE_COMM_CODE_VALE_MIN && this.code <= SERVICE_NO_COMM_VALE_MAX){
            return true;
        }
        return false;
    }
}
