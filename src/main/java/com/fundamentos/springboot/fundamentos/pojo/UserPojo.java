package com.fundamentos.springboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@AllArgsConstructor
public class UserPojo {
    private String email;
    private String password;
    private String age;

}
