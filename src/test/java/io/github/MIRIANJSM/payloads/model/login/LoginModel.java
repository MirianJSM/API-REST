package io.github.MIRIANJSM.payloads.model.login;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginModel {

    private String username;
    private String password;


    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
