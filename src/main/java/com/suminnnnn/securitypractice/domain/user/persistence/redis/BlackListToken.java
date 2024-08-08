package com.suminnnnn.securitypractice.domain.user.persistence.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@RedisHash(value = "blackListToken")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BlackListToken {

    @Id
    private String blackListToken;

    @TimeToLive
    private Long expiration;
}
