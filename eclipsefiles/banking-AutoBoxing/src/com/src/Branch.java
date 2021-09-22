package com.src;

import java.util.ArrayList;

public class Branch {
private String name;
private ArrayList<Customer> customers=new ArrayList();
public Branch(String name) {
	//super();
	this.name = name;
	this.customers = customers;
}
public boolean newCustomer(String name,double initialAmount) {
	if(findCustomer(name)==null) {
		this.customers.add(new Customer(name,initialAmount));
		return true;
	}
	return false;
}
private Customer findCustomer(String name2) {
	// TODO Auto-generated method stub
	for(int i=0;i<this.customers.size();i++) {
		if(this.customers.get(i).getName().equals(name2))
		{
		return	this.customers.get(i);
		}
	}
	return null;
}
public boolean addCustomerTransaction(String name,double amount) {
	Customer c=findCustomer(name);
	if(c!=null) {
		c.addTransaction(amount);
		return true;
	}
	return false;
}
public String getName() {
	return name;
}
public ArrayList<Customer> getCustomer() {
	return customers;
}

}
