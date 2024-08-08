package com.suminnnnn.securitypractice.global.exception;

import com.suminnnnn.securitypractice.global.exception.constant.ErrorCode;

public class OAuth2Exception extends GeneralException{

    public OAuth2Exception(ErrorCode code) {
        super(code.getMessage());
    }
}
