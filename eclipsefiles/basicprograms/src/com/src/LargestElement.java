package com.src;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c= {1,2,3,56,4};
		int max=c[0];
		int min=c[0];
		for(int i=0;i<c.length;i++) {
				if(c[i]>max) {
					max=c[i];
				}
				if(c[i]<min) {
					min=c[i];
				}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
