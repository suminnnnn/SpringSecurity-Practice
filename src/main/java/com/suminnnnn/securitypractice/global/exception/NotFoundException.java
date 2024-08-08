package com.suminnnnn.securitypractice.global.exception;


import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class NotFoundException extends GeneralException {

    public NotFoundException(ErrorCode code) {
        super(code.getMessage());
    }

}
