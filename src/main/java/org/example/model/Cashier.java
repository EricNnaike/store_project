package org.example.model;

import org.example.enum_f.CashierRole;
import org.example.interface_f.ICashier;

public class Cashier extends Staff implements ICashier {
    private CashierRole role;
    private int assessment;
    private String name;


    public Cashier(CashierRole role, int assessment, String name) {
        this.role = role;
        this.assessment = assessment;
        this.name = name;
    }

    public CashierRole getRole() {
        return role;
    }

    public void setRole(CashierRole role) {
        this.role = role;
    }

//    public Store getProducts() {
//        return products;
//    }

    public int getAssessment() {
        return assessment;
    }


    @Override
    //Method to sell a product to a customer.
    //This method sells a product to a customer by if the cashier role is employed also, if the store
    //contains the products in the customer cart, and if the amount in the customer wallet is equal to
    //or greater than the total price of products in the cart.
    public void sellProduct(Customers customers, Store store) {
        if (role == CashierRole.EMPLOYED) {
            if (store.getProduct() != null && store.getProduct().contains(customers.getCart().getPurchasedProduct().get(0))) {
                if (customers.getWallet().getAmount() >= customers.getCart()
                        .totalPriceInCart()) {
                    store.getProduct().remove(customers.getCart());
                    System.out.println("Item sold");
                }else {
                    System.out.println("No sufficent balance");
                }
            }else{
                System.out.println("Item is not contained in cart");
            }
        }else {
            System.out.println("This action is for staff!. You are not authorised.");
        }
    }

    @Override
    //Method to print invoice.

    public void printRecipt(Transaction transaction) {
        transaction.printInvoice();
    }
}
