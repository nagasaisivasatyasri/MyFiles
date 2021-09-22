package com.src;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] c=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++) {
	c[i]=s.nextInt();
	s.nextLine();
}
int[] b=new int[c.length];
for(int i=0;i<c.length;i++) {
	b[i]=c[i];
}
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
}
	}

}
