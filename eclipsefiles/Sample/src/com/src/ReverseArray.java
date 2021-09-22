package com.src;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		reverse(arr);
		System.out.println("after reverseing "+Arrays.toString(arr));
	}
private static void reverse(int[] array) {
	int maxIndex=array.length-1;
	int half=maxIndex/2;
	int temp;
	for(int i=0;i<half;i++) {
		temp=array[i];
		array[i]=array[maxIndex-i];
		array[maxIndex-i]=temp;
	}
	//return array;
}
}
