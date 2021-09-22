package com.src;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="satyasri";
int count=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)!=' ') {
		count++;
	}
}
System.out.println(count);
	}

}
