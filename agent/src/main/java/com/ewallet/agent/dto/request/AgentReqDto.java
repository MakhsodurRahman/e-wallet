package com.ewallet.agent.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AgentReqDto {

    private String userName;
    private String displayName;
    private String fullName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private String pin;
    private String role;
    private String profileImagePath;
}
