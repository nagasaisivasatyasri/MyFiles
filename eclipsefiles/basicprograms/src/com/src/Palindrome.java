package com.src;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=141;
int pal=palindrome(c);
System.out.println(pal);
if(c==pal) {
	System.out.println("palindrome");
}
else
{
	System.out.println("Not a palindrome");
}
Scanner s=new Scanner(System.in);
String str=s.next();

String d=ispalindrome(str);
System.out.println(d);
	}
public static int palindrome(int n) {
	int temp=n,rem=0,sum=0;
	
	while(n>0) {
		 rem=n%10;
		sum=sum*10+rem;
		n=n/10;
	}
	return sum;
}
public static String ispalindrome(String str) {
	String str1="";
	for(int i=str.length()-1;i>=0;i--) {
		str1=str1+str.charAt(i);
	}
	if(str1.equals(str)) {
		return "palindrome";
	}
	else {
		return "Not a palindrome";
	}
}
}
