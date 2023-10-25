package io.github.MIRIANJSM.payloads;

import com.google.gson.Gson;
import io.github.MIRIANJSM.payloads.model.produtos.ProdutosModel;
import io.github.MIRIANJSM.utils.Utils;

public class ProdutosPayload {

    public static String toJson(String title, int preco, String description, double discountPercentage, double rating, int stock, String brand, String category, String thumbnail){
        ProdutosModel produtos
                = new ProdutosModel(title,preco,description,discountPercentage,rating,stock,brand,category,thumbnail);
        return new Gson().toJson(produtos);
    }

}
