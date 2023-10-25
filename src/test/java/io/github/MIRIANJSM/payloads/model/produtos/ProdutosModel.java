package io.github.MIRIANJSM.payloads.model.produtos;

import lombok.Data;

@Data
public class ProdutosModel {

    private String title;
    private String description;
    private int price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;

    public ProdutosModel(String title, int preco, String description, double discountPercentage, double rating, int stock, String brand, String category, String thumbnail) {
        this.title = "Perfume Oil";
        this.description = "Mega Discount, Impression of A...";
        this.price = 13;
        this.discountPercentage = 8.4;
        this.rating = 4.26;
        this.stock = 65;
        this.brand = "Impression of Acqua Di Gio";
        this.category = "fragrances";
        this.thumbnail = "https://i.dummyjson.com/data/products/11/thumnail.jpg";

    }
}