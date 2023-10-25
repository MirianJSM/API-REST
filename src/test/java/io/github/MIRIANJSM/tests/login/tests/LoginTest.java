package io.github.MIRIANJSM.tests.login.tests;

import io.github.MIRIANJSM.tests.base.tests.BaseTest;
import io.github.MIRIANJSM.tests.login.requests.LoginRequest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@Slf4j
//@Feature("Login")
public class LoginTest extends BaseTest {

    LoginRequest loginRequest = new LoginRequest();

    @Test
    @Tag("todos")
    @Description("Deve realizar o login com sucesso.")
    public void deveRealizarOLoginComSucesso() throws Exception {
        loginRequest.logar("kminchelle", "0lelplR")
                .then()
                .statusCode(HttpStatus.SC_OK).body("id",equalTo(15));
    }

    @Test
    @Tag("todos")
    @Description("Deve realizar o login com username inválido.")
    public void deveRealizarOLoginComUsernameInvalido() throws Exception {
        loginRequest.logar("invalido","0lelplR")
                .then()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("message", equalTo("Invalid credentials"));
    }

    @Test
    @Tag("todos")
    @Description("Deve realizar o login com username em branco.")
    public void deveRealizarOLoginComUsernameEmBranco() throws Exception {
        loginRequest.logar("", "teste")
                .then()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("message", equalTo("Invalid credentials"));
    }

    @Test
    @Tag("todos")
    @Description("Deve realizar o login com senha inválida.")
    public void deveRealizarOLoginComSenhaInvalida() throws Exception {
        loginRequest.logar("kminchelle", "test")
                .then()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("message", equalTo("Invalid credentials"));
    }

    @Test
    @Tag("todos")
    @Description("Deve realizar o login com senha em branco.")
    public void deveRealizarOLoginComSenhaEmBranco() throws Exception {
        loginRequest.logar("kminchelle", "")
                .then()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("message", equalTo("Invalid credentials"));
    }





}
