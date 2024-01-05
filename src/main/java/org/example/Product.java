package org.example;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Product {
    private final String productId;
    private final String productName;
    private final int productPrice;

    public Product(String name, int price) {
        productId = UUID.randomUUID().toString();
        this.productName = name;
        this.productPrice = price;
    }
}
