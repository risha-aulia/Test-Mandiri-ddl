package com.example.simpleproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String memberName;
    private String memberAddress;
    private Date memberBirth;
    private String memberEmail;
    private String memberPhone;
}
