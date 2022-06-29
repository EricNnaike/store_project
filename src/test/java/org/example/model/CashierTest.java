package org.example.model;

import org.example.enum_f.CashierRole;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    Product product1 = new Product("Egg", 80, 10);
    Product product2  = new Product("Conflakes", 70, 15);
    Product product3  = new Product("Milk", 60, 20);
    Product product4  = new Product("Sugar", 10, 500);

    ArrayList<Product> list = new ArrayList<>();
    ArrayList<Product> list_purchased_product = new ArrayList<>();
    Store store = new Store(list);
    Customers customers = new Customers(new Wallet(10000), new Cart(list_purchased_product));
    Cashier cashierGood = new Cashier(CashierRole.EMPLOYED, 70, "Ugochi");

    @Test
    void sellProduct() {

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        list_purchased_product.add(product1);


        cashierGood.sellProduct(customers, store);
        assertEquals(cashierGood.getRole(), CashierRole.EMPLOYED);
    }

}