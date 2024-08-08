package com.suminnnnn.securitypractice.global.security.client;

import com.suminnnnn.securitypractice.global.security.dto.GoogleUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "googleUserFeignClient", url = "https://www.googleapis.com/oauth2/v3", configuration = GoogleFeignClientConfig.class)
public interface GoogleUserFeignClient {

    @GetMapping("/userinfo")
    GoogleUserInfo getUserInfo(@RequestHeader("Authorization") String authorization);
}
