package com.sujeevan;

import java.util.ArrayList;

public class Customer {
    private String customerName;

   private ArrayList<Double> Transaction; //= new ArrayList<Double>();

    public Customer(String customerName,double initialamount) {
        this.customerName = customerName;
        this.Transaction = new ArrayList<Double>();
        addTransaction(initialamount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getInitialTransaction() {
        return Transaction;
    }

    public void addTransaction(double amount){
        this.Transaction.add(amount);
    }


}
