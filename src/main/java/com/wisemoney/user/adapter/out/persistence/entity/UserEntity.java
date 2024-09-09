package com.wisemoney.user.adapter.out.persistence.entity;

import com.wisemoney.user.domain.model.Role;
import com.wisemoney.user.domain.model.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Entity
@Builder(access = AccessLevel.PRIVATE)
@Getter
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public User toDomain() {
        return User.builder()
                .id(this.id)
                .login(this.login)
                .password(this.password)
                .role(Role.fromText(this.role))
                .build();
    }

    public static UserEntity fromDomain(User domain) {
        return UserEntity.builder()
                .id(domain.getId())
                .login(domain.getLogin())
                .password(domain.getPassword())
                .role(domain.getRole().getText())
                .build();
    }
}
