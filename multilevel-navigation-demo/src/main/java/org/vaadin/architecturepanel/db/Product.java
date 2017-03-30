package org.vaadin.architecturepanel.db;

public class Product implements Entity{

    private final int productId;
    private final String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
