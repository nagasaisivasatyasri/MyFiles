package com.src;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fib();
System.out.println();
int c=recfib(5);
System.out.println(c);
	}
public static void fib() {
	int num1=0,num2=1;
	System.out.print(num1+" ");
	int c=0;
	for(int i=2;i<=10;i++) {
		c=num1+num2;
		num1=num2;
		num2=c;
		System.out.print(c+" ");
	}
	
}
public static int recfib(int n) {
	if(n==0)
	{
		return 0;
	}
	else if(n==1 || n==2) {
		return 1;
	}
	else
	{
	return	recfib(n-1)+recfib(n-2);
		
	}
}
}
