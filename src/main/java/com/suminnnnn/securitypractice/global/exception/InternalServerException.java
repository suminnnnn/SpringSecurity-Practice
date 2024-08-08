package com.suminnnnn.securitypractice.global.exception;

import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class InternalServerException extends GeneralException {

    public InternalServerException(ErrorCode errorCode) {
        super(errorCode);
    }

}
