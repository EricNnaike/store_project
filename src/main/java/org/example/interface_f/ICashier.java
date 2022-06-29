package org.example.interface_f;

import org.example.model.Customers;
import org.example.model.Store;
import org.example.model.Transaction;

public interface ICashier {
    public void sellProduct(Customers customers, Store store);
    void printRecipt(Transaction transaction);
}
