package com.suminnnnn.securitypractice.domain.user.implement;

import com.suminnnnn.securitypractice.domain.user.persistence.User;
import com.suminnnnn.securitypractice.domain.user.persistence.UserRepository;
import com.suminnnnn.securitypractice.global.annotation.Adapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Adapter
@RequiredArgsConstructor
public class UserQueryAdapter {

    private final UserRepository userRepository;

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
