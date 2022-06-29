package org.example.model;

public class Transaction {
    private Customers customers;

    public Transaction(Customers customers) {
        this.customers = customers;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public void printInvoice() {
        for (Product product: customers.getCart().purchasedProduct) {
            System.out.println("Reciept: \nName of product: " + product.getName() + ", " + "Price #" + product.getPrice() + ", " +
                    "Quantity " + product.getQuantity());
        }
        System.out.println("Total price of goods: " + customers.getCart().totalPriceInCart());
        System.out.println("Thank you for patroniing with us");
    }
}
