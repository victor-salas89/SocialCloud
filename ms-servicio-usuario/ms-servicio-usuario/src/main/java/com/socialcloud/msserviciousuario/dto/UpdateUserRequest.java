package com.socialcloud.msserviciousuario.dto;

import lombok.Data;

@Data
public class UpdateUserRequest {

    private String fullName;
    private String username;
    private String bio;
    private String avatarUrl;
}