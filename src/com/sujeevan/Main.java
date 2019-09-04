package com.sujeevan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("Comercial Bank");
        bank.addNewBranch("Colombo");

        bank.addCustomer("Colombo","DON",50000.00);
        bank.addCustomer("Colombo","MARK",20000.00);
        bank.addCustomer("Colombo","SAI",30000.00);
        bank.addCustomer("Colombo","GAUTAM",550000.00);

        bank.addNewBranch("Badulla");
        bank.addCustomer("Badulla","Karan",3000.00);


        bank.addCustomerTransactions("Colombo","DON",23000.00);
        bank.addCustomerTransactions("Colombo","DON",57000.00);
        bank.addCustomerTransactions("Colombo","MARK",2600.00);

        bank.listCustomers("Colombo",true);
        //bank.listCustomers("Badulla",true);

    }


}
