package com.suminnnnn.securitypractice.domain.user.implement;


import com.suminnnnn.securitypractice.domain.user.persistence.User;
import com.suminnnnn.securitypractice.domain.user.persistence.UserRepository;
import com.suminnnnn.securitypractice.global.annotation.Adapter;
import lombok.RequiredArgsConstructor;

@Adapter
@RequiredArgsConstructor
public class UserCommandAdapter {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    

}
