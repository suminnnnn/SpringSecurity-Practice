package com.suminnnnn.securitypractice.global.security.dto;

import lombok.Getter;

public class AuthRequest {

    @Getter
    public static class GoogleLoginRequestDto {
        String idToken;
    }
}
