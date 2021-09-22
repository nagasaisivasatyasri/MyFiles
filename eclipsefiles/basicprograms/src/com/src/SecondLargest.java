package com.src;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] my= {2,3,4,1,5};
Arrays.sort(my);
for(int i=0;i<my.length;i++) {
	for(int j=i+1;j<my.length;j++) {
		if(my[i]<my[j]) {
			int temp=my[i];
			my[i]=my[j];
			my[j]=temp;
		}
	}
}
System.out.println(my[1]);
	}

}
