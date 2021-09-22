package com.src;

public class FOCountOFVowels_And_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is a really simple sentence";
str=str.toLowerCase();
int v=0,c=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u') {
		v++;
	}
	else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
		c++;
	}
	}
System.out.println(v+" "+c);

	}
}
