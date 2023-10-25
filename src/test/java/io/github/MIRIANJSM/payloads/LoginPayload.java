package io.github.MIRIANJSM.payloads;

import com.google.gson.Gson;
import io.github.MIRIANJSM.payloads.model.login.LoginModel;

public class LoginPayload {

    public static String toJson(String username, String password){
        LoginModel login = new LoginModel(username, password);
        return new Gson().toJson(login);
    }


}
