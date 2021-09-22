package com.src;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=fact(n);
int d=factrec(n);
System.out.println(c);
System.out.println(d);
	}

	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static int factrec(int n) {
		if(n==0) {
			return 1;
		}
		else
		{
			return n*factrec(n-1);
		}
	}
}
