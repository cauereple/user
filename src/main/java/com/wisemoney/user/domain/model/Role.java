package com.wisemoney.user.domain.model;

import lombok.Getter;

public enum Role {

    ADMIN("admin"),
    USER("user");

    @Getter
    private String text;

    Role(String role){
        this.text = role;
    }
}
