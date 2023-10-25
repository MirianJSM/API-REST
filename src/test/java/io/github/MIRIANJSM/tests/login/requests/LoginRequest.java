package io.github.MIRIANJSM.tests.login.requests;

import io.github.MIRIANJSM.payloads.LoginPayload;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.*;

public class LoginRequest {

    private final String PATH_LOGIN = "auth/login";

    @Step("Realizar login - POST")
    public Response logar(String username, String password) {
        return given()
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                .when()
                    .body(LoginPayload.toJson(username, password))
                    .post(PATH_LOGIN);
    }




    public String getBearerToken(String username, String password) {
        return logar(username, password)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .path("authorization");
    }
}
