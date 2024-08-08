package com.suminnnnn.securitypractice.global.security;

import com.suminnnnn.securitypractice.global.common.ApiResponseDto;
import com.suminnnnn.securitypractice.global.security.dto.AuthResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name="인증", description = "인증 관련 API 입니다.")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @GetMapping("/oauth2/login/oauth2/code/google")
    @Operation(summary = "구글 로그인 API", description = "구글 로그인 페이지에서 리디렉션 되어 토큰 응답 하는 API입니다.")
    public ApiResponseDto<AuthResponse.LoginResponseDto> googleLogin(@RequestParam(name ="code") String code){
        return ApiResponseDto.of(authService.googleLogin(code));
    }
}
