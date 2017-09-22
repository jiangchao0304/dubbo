/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.sunvalley.erp.face.exception;

import java.util.Map;

/**
 * 业务逻辑异常。
 *
 * @Author:
 * @Date: 2017-03-31 19:32
 */
public class FaceException extends RuntimeException {
    /** serialVersionUID */
    private static final long serialVersionUID = 2332608236621015982L;
    // 异常代码
    private String key;
    private String[] values;

    // 构造器重载
    public FaceException() {
        super();
    }

    public FaceException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public FaceException(String message) {
        super(message);
    }

    public FaceException(Throwable throwable) {
        super(throwable);
    }

    public FaceException(String message, String key) {
        super(message);
        this.key = key;
    }

    public FaceException(String message, String key, String value) {
        super(message);
        this.key = key;
        this.values = new String[] { value };
    }

    public FaceException(String message, String key, String[] values) {
        super(message);
        this.key = key;
        this.values = values;
    }


    public String getKey() {
        return key;
    }


    public String[] getValues() {
        return values;
    }
}

