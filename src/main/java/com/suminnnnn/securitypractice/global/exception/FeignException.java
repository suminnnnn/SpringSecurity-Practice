package com.suminnnnn.securitypractice.global.exception;

import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class FeignException extends GeneralException{

    public FeignException(ErrorCode errorCode) {
        super(errorCode);
    }
}
