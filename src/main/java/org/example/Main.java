package org.example;

import org.example.enum_f.CashierRole;
import org.example.model.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> listOfProductsInStore = new ArrayList<>();
        Product product1 = new Product("Egg", 80, 10);
        Product product2  = new Product("Conflakes", 70, 15);
        Product product3  = new Product("Milk", 60, 20);
        Product product4  = new Product("Sugar", 10, 500);

        // Stored products
        listOfProductsInStore.add(product1);
        listOfProductsInStore.add(product2);
        listOfProductsInStore.add(product3);
        listOfProductsInStore.add(product4);

        Store store = new Store(listOfProductsInStore);

        Manager manager = Manager.getInstance();
        Cashier cashier = new Cashier(CashierRole.APPLICANT, 70, "Ogechi");
        manager.hireCashier(cashier);



        // Purchased product
        List<Product> purchasedProduct = new ArrayList<>();
        purchasedProduct.add(product1);

        //Instantiating customer object
        Wallet wallet = new Wallet(900);
        Cart cart = new Cart(purchasedProduct);
        Customers customers1 = new Customers(wallet, cart);
        customers1.getCart().setPurchasedProduct(purchasedProduct);
//        Customers

        // Cashier sell product to customers
        cashier.sellProduct(customers1,store);

        //Customer buying product
        customers1.buyProduct();

        //Instantiating the transaction class
        Transaction transaction = new Transaction(customers1);
        cashier.printRecipt(transaction);





    }
}