package com.src;

import java.util.ArrayList;

public class Customer {
private String name;
private ArrayList<Double> trans=new ArrayList<>();
public Customer(String name, double initialAmount) {
//	super();
	this.name = name;
	this.trans = trans;
	addTransaction(initialAmount);
}
public void addTransaction(double initialAmount) {
	// TODO Auto-generated method stub
	this.trans.add(initialAmount);
	
}
public String getName() {
	return name;
}
public ArrayList<Double> getTrans() {
	return trans;
}

}
