package com.sunvalley.erp.common.exception;


import com.sunvalley.erp.common.enums.ApiMsgEnum;

/**
 * 系统异常
 * Created by jcgh on 2016-05-05.
 */
public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 2332608236621015983L;

    private String code;

    public SystemException() {
    }

    /**
     * @param message
     */
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(ApiMsgEnum msgEnum) {
        super(msgEnum.getResDes());
        this.code = msgEnum.getResCode();
    }

    /**
     * @param cause
     */
    public SystemException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
