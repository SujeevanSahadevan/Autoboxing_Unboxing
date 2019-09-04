package com.sujeevan;

import java.util.ArrayList;

public class Branch {
    private String  branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addnewCustomer (String customerName, double initialamount ){
        if (findcustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialamount));
            return true;
        }

        return false;
    }
    public boolean addnewCustomerTransaction(String customerName , double amount ){
        Customer existingCustomer = findcustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findcustomer(String customerName){
        for (int i=0 ; i< this.customers.size() ;i++){
            Customer checkedcustomer = customers.get(i);
            if (checkedcustomer.getCustomerName().equals(customerName)){
                return checkedcustomer;

            }
        }

        return null;
    }
}
