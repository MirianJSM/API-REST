package io.github.MIRIANJSM.tests.usuarios.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UsuariosRequest {

    private final String PATH_USUARIOS = "/users";

    @Step("Listar usuários cadastrados")
    public Response listar() {
        return given()
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                .when()
                    .get(PATH_USUARIOS);
    }

    @Step("Listar usuários cadastrados")
    public Response listar(String queryParam, String valueParam) {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .queryParam(queryParam, valueParam)
                .get(PATH_USUARIOS);
    }






}
