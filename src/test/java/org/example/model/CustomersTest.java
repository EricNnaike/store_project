package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomersTest {

    ArrayList<Product> list_purchased_product = new ArrayList<>();
    Product product1 = new Product("Egg", 80, 10);
    Product product2  = new Product("Conflakes", 70, 15);
    Customers customers = new Customers(new Wallet(3000), new Cart(list_purchased_product));

    @Test
    void buyProduct() {
        list_purchased_product.add(product1);
        list_purchased_product.add(product2);

        customers.buyProduct();

        assertEquals(customers.getWallet(), customers.getCart().totalPriceInCart());
    }
}