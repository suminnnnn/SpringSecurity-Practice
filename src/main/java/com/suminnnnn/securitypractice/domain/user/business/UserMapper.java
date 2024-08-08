package com.suminnnnn.securitypractice.domain.user.business;

import com.suminnnnn.securitypractice.domain.user.persistence.User;
import com.suminnnnn.securitypractice.domain.user.presentation.dto.UserResponse;
import com.suminnnnn.securitypractice.global.security.dto.GoogleUserInfo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static User toUser(GoogleUserInfo userInfo, String provider) {
        return User.builder()
                .email(userInfo.getEmail())
                .name(userInfo.getName())
                .provider(provider)
                .build();
    }

    public static UserResponse.UserInfo toUserInfo(User user) {
        return UserResponse.UserInfo.builder()
                .email(user.getEmail())
                .build();
    }
}
