package com.src;

import java.util.ArrayList;

public class Bank {
private String bankName;
private ArrayList<Branch> branch=new ArrayList();
public Bank(String bankName) {
	//super();
	this.bankName = bankName;
	this.branch = branch;
}
public String getBankName() {
	return bankName;
}
public ArrayList<Branch> getBranch() {
	return branch;
}
public boolean addBranch(String branchName) {
	Branch find=findBranch(branchName);
	if(find==null) {
		this.branch.add(new Branch(branchName));
		return true;
	}
	return false;
}
public boolean addCustomer(String branchName,String customerName,double amount)
{
	Branch find=findBranch(branchName);
if(find!=null) {
return	find.newCustomer(customerName, amount);

}
return false;
}
public boolean addCustomerTransaction(String branchName,String customername,double amount) {
	Branch find=findBranch(branchName);
	if(find!=null) {
	return	find.addCustomerTransaction(customername, amount);

	}
	return false;

}
private Branch findBranch(String branchName) {
	// TODO Auto-generated method stub
	for(int i=0;i<this.branch.size();i++) {
		if(this.branch.get(i).getName().equals(branchName))
		{
		return	this.branch.get(i);
		}
	}
	return null;

//	return null;
}
public boolean listCustomers(String branchName,boolean showTransactions) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
        System.out.println("Customers details for branch " + branch.getName());
        ArrayList<Customer> branchCustomers = branch.getCustomer();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
            if (showTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTrans();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        } return true;
    } else {
        return false;
    }
}
}