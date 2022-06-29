package org.example.model;

import java.util.List;

public class Store {
    private List<Product> product;

    public Store(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
