package org.example.model;

import org.example.enum_f.CashierRole;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();
    Product product1 = new Product("Egg", 80, 10);
    Product product2  = new Product("Conflakes", 70, 15);
    Product product3  = new Product("Milk", 60, 20);
    Product product4  = new Product("Sugar", 10, 500);

    List<Product> listOfProductsInStore = new ArrayList<>();
    Store store =  new Store(listOfProductsInStore);

    @Test
    void hireCashier() {
        Cashier cashierGood = new Cashier(CashierRole.APPLICANT, 70, "Oge");

        listOfProductsInStore.add(product1);
        listOfProductsInStore.add(product2);
        listOfProductsInStore.add(product3);
        listOfProductsInStore.add(product4);

        manager.hireCashier(cashierGood);
        assertEquals(cashierGood.getRole(), CashierRole.EMPLOYED);
//        Cashier actual = manager.hireCashier(cashierGood);
    }
}