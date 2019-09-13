package com.lib.equipment.manager.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    Page_Not_found(2001,"页面不存在"),
    SYS_ERROR(2004, "服务冒烟了，要不然你稍后再试试！！！"),
    Object_Not_Found(2003,"对象不存在"),
    Encode_Error(2005,"加密失败"),
    Read_Excel_Error(2006,"Excel读取失败"),
    ;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
