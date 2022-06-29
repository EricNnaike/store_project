package org.example.model;

import org.example.enum_f.CashierRole;
import org.example.interface_f.IManager;

public class Manager extends Staff implements IManager {
    public static Manager manager = null;

    public Manager() {

    }

    public static Manager getInstance() {
        if (manager == null) {
            manager = new Manager();
        }
        return manager;
    }


    @Override
    //Method to hire a cashier. This method checks if the cashier role is applicant, and if the cashier
    //assessment is greater than score 60 before the cashier could be hireed.
    public void hireCashier(Cashier cashier) {
        if (cashier.getRole() == CashierRole.APPLICANT) {
            if (cashier.getAssessment() > 60) {
                cashier.setRole(CashierRole.EMPLOYED);
                System.out.println("Congratulations. You have been hired!");
            }else {
                System.out.println("Sorry, you didn't pass the assessment");
            }
        }else {
            System.out.println("You are already employed!");
        }
    }
}
