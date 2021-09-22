package com.src;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="cat";
String str1="cat";
str=str.toLowerCase();
str1=str1.toLowerCase();

char[] s=str.toCharArray();
char[] s1=str1.toCharArray();
Arrays.sort(s);
Arrays.sort(s1);
if(s.length==s1.length) {
	if(Arrays.equals(s, s1)==true) {
		System.out.println("anagrams");
	}
	else
	{
		System.out.println("not anagrams");
	}
}
else
{
	System.out.println("not anagrams");
}
	}

}
