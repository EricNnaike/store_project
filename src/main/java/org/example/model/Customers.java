package org.example.model;

import org.example.interface_f.ICustomer;

public class Customers implements ICustomer {
    private Wallet wallet;
    private Cart cart;

    public Customers(Wallet wallet, Cart cart) {
        this.wallet = wallet;
        this.cart = cart;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void buyProduct() {
        if (cart.purchasedProduct.size() > 0) {
            if (wallet.getAmount() >= cart.totalPriceInCart()) {
                double balance = wallet.getAmount() - cart.totalPriceInCart();
                wallet.setAmount(balance);
                System.out.println("Product purchased");
            }else {
                System.out.println("Insufficient balance to purchase product");
            }
        }else {
            System.out.println("You have not selected any product");
        }
    }

    @Override
    public String toString() {
        return "Customers{" +
                "wallet=" + wallet +
                ", cart=" + cart +
                '}';
    }
}
