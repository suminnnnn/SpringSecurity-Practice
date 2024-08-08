package com.suminnnnn.securitypractice.global.exception;

import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class UnauthorizedException extends GeneralException {

    public UnauthorizedException(ErrorCode code) {
        super(code.getMessage());
    }

}
