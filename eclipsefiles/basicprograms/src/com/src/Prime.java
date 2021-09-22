package com.src;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean c=primeornot(2);
		if(c) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

	public static boolean primeornot(int b) {
		boolean flag=true;
		boolean isprime=false;
		for(int i=2;i<b/2;i++) {
			if(b%i==0)
			{
				flag=false;
			}
		}
		if(flag==true) {
			isprime=true;
		}
		return isprime;
	}
}
