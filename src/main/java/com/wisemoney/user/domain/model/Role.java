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

    public static Role fromText(String text){
        for (Role role: Role.values()) {
            if (role.getText().equalsIgnoreCase(text)) {
                return role;
            }
        }

        return null;
//        throw new RoleNotFoundException(text);
    }
}
