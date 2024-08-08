package com.suminnnnn.securitypractice.global.exception;


import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class BadRequestException extends GeneralException {

    public BadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
