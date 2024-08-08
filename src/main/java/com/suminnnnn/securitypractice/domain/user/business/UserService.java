package com.suminnnnn.securitypractice.domain.user.business;

import com.suminnnnn.securitypractice.domain.user.implement.UserQueryAdapter;
import com.suminnnnn.securitypractice.domain.user.persistence.User;
import com.suminnnnn.securitypractice.domain.user.presentation.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserQueryAdapter userQueryAdapter;

    @Transactional
    public UserResponse.UserInfo findUserEmail(User user) {
        return UserMapper.toUserInfo(user);
    }

}
