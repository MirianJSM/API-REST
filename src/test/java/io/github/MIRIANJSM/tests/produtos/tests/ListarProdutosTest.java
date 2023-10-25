package io.github.MIRIANJSM.tests.produtos.tests;

import io.github.MIRIANJSM.tests.base.tests.BaseTest;
import io.github.MIRIANJSM.tests.produtos.requests.ProdutosRequest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

@Feature("Produtos")
public class ListarProdutosTest extends BaseTest {

    ProdutosRequest produtos = new ProdutosRequest();

    @Test
    @Tag("todos")
    @Description("Deve listar os produtos com sucesso.")
    public void deveListarProdutosComSucesso() throws Exception {
        produtos.listar()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .time(lessThan(2L), TimeUnit.SECONDS);
    }

    @Test
    @Tag("todos")
    @Description("Deve listar os produto por id.")
    public void deveListarProdutoPorId() throws Exception {
        produtos.buscarPorId("1")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .time(lessThan(2L), TimeUnit.SECONDS);
    }

    @Test
    @Tag("todos")
    @Description(" validar  o de listar de produto por id inexistente.")
    public void deveListarProdutoPorIdInexisnente() throws Exception {
        produtos.buscarPorId("0")
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND)
                .body("message", equalTo("Product with id '0' not found"))
                .time(lessThan(2L), TimeUnit.SECONDS);
    }

    @Test
    @Tag("todos")
    @Tag("schemas")
    @Description("Deve validar o schema json da lista de produtos.")
    public void deveValidarSchemaListarProdutos() throws Exception {
        produtos.listar()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath("schemas/produtos/produtos.json"));
    }

    @Test
    @Tag("todos")
    @Description("Deve Adicionar um Produto com Sucesso.")
    public void deveAdicionarProdutosComSucesso() throws Exception {
        produtos.add("",13,"",8.4,4.26,65, "","","")
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .time(lessThan(2L), TimeUnit.SECONDS);
    }



}



