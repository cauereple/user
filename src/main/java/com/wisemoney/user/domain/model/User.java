package com.wisemoney.user.domain.model;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;

@Builder
@Getter
@Generated
public class User {

    private String id;

    private String login;

    private String password;

    private Role role;
}
