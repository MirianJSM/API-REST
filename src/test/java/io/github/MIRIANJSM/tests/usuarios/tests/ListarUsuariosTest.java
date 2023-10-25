package io.github.MIRIANJSM.tests.usuarios.tests;

import io.github.MIRIANJSM.tests.base.tests.BaseTest;
import io.github.MIRIANJSM.tests.usuarios.requests.UsuariosRequest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

@Slf4j
@Feature("Listar usuários")
public class ListarUsuariosTest extends BaseTest {

    UsuariosRequest usuarios = new UsuariosRequest();

    @Test
    @Tag("todos")
    @Description("Deve listar os usuários com sucesso.")
    public void deveListarUsuariosComSucesso() throws Exception {
        usuarios.listar()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .time(lessThan(2L), TimeUnit.SECONDS);
    }





    @Tag("schemas")
    @Tag("todos")
    @Test
    @Description("Deve validar o schema json da lista de usuários")
    public void deveValidarSchemaListaUsuarios() throws Exception {
        usuarios.listar()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath("schemas/usuarios/usuarios.json"));
    }




}
