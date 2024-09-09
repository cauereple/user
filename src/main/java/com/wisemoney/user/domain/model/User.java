package com.wisemoney.user.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

    private String id;

    private String login;

    private String password;

    private Role role;
}
