package com.src;

import java.util.Scanner;

public class MinimalElement {
private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated metho
		int c=readInteger();
		int[] arr=readElements(c);
		int m=findMin(arr);
		System.out.println(m);
	}
	private static int readInteger(){
        int count=s.nextInt();
        s.nextLine();
        return count;
    }
    
private static int[] readElements(int count) {
	int[] array=new int[count];
	for(int i=0;i<count;i++) {
		int number=s.nextInt();
		s.nextLine();
		array[i]=number;
	}
	return array;
}
private static int findMin(int[] array) {
	int min=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]<min) {
			min=array[i];
		}
	}
	return min;
}
}
