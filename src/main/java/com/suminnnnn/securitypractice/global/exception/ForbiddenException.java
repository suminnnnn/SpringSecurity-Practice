package com.suminnnnn.securitypractice.global.exception;

import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class ForbiddenException extends GeneralException {

    public ForbiddenException(ErrorCode errorCode) {
        super(errorCode);
    }

}
