package com.src;

public class PossibleSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="funbucket";
int n=str.length();
int temp=0;
String[] s=new String[n*(n+1)/2];
for(int i=0;i<str.length();i++) {
	for(int j=i;j<str.length();j++){
		s[temp]=str.substring(i, j+1);
		temp++;
	}
}
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}
	}

}
