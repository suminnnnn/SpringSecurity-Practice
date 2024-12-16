package com.suminnnnn.securitypractice.domain.user.persistence;

import com.suminnnnn.securitypractice.global.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@DynamicInsert
@DynamicUpdate
@Getter
@Builder
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10) DEFAULT 'ACTIVE'")
    private Status status;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String provider;

    @Column
    private LocalDate deleteRequestDate;

    @Column
    private LocalDate dormantStartDate;

    @Column(nullable = false)
    private LocalDateTime lastLoginTime;

    public void update(String name, String email, String provider) {
        this.name = name;
        this.email = email;
        this.provider = provider;
    }

    public void updateLoginTime() {
        this.lastLoginTime = LocalDateTime.now();
    }

}
