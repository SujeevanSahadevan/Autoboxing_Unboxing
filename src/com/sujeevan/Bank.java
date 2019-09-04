package com.sujeevan;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName ){
        if (findbranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName ,String customerName , double initialamount ){
        Branch branch = findbranch(branchName);
        if (branch != null){
            return branch.addnewCustomer(customerName,initialamount);
        }
        return false;
    }

    public boolean addCustomerTransactions(String branchName ,String customerName , double amount){
        Branch branch = findbranch(branchName);
        if (branch != null){
            return branch.addnewCustomerTransaction(customerName,amount);
        }
        return false;
    }


    private Branch findbranch(String branchName){
        for (int i=0 ; i< this.branches.size(); i++){
            Branch checkedbranch = this.branches.get(i);
            if (checkedbranch.getBranchName().equals(branchName)){
                return checkedbranch;

            }
        }

        return null;
    }

    public boolean listCustomers(String branchName , boolean showTransactions){
        Branch branch = findbranch(branchName);
        if (branch != null){
            System.out.println("Customers details for Branch " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0 ; i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                //System.out.println("Customer "+ branchCustomer.getCustomerName());
                System.out.println("Customer " + branchCustomers.get(i).getCustomerName() + "[ " + (i+1) +" ]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getInitialTransaction();
                    for (int j =0; j< transactions.size();j++){
                        System.out.println("[ " + ( j+1 )+ "] amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }



    }












}
