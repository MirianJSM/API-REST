package io.github.MIRIANJSM.tests.produtos.requests;

import io.github.MIRIANJSM.payloads.LoginPayload;
import io.github.MIRIANJSM.payloads.ProdutosPayload;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Condition;

import static io.restassured.RestAssured.given;

public class ProdutosRequest {

    private final String PATH_PRODUTOS = "/products";
    private final String PATH_PRODUTOSADD = "/products/add";

    @Step("Listar produtos cadastrados")
    public Response listar() {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(PATH_PRODUTOS);
    }
    @Step("Adicionar um novo produto")
    public Response add(String title, int preco, String description, double discountPercentage, double rating, int stock, String brand, String category, String thumbnail) {
        String add;
        return given()
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .when()
                    .body(ProdutosPayload.toJson(title,preco,description,discountPercentage,rating,stock,brand,category,thumbnail))
                    .post(PATH_PRODUTOSADD);
    }



    @Step("Buscar produtos por ID")
    public Response buscarPorId(String id) {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .pathParam("_id", id)
                .get(PATH_PRODUTOS + "/{_id}");
    }



}
