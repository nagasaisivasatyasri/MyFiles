package com.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created.");
        }

        bank.addCustomer("Adelaide", "Bart", 50.05);
        bank.addCustomer("Adelaide", "Tom", 100.24);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 33.33);

        bank.addCustomerTransaction("Adelaide", "Bart", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tom", 11.55);
        bank.addCustomerTransaction("Adelaide", "Percy", 42.48);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Bryan", 5.53)) {
            System.out.println("Error Melbourne branch doesn't exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Daniele", 50.33)) {
            System.out.println("Customer Daniele doesn't exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tom", 12.21)) {
            System.out.println("Customer Tom already exists");
        }
        bank.listCustomers("Adelaide", false);
        
    }

	}


