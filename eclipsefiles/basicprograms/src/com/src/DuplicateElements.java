package com.src;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] n= {2,2,3,4,4,5,6,7,6,3};
//		for(int i=0;i<n.length;i++) {
//			for(int j=i+1;j<n.length;j++) {
//				if(n[i]==n[j])
//				{
//					System.out.println(n[i]);
//				}
//			}
//		}
		String[] str= {"hello","hello","hii","hai","hai"};
		int[] my= {};
		for(int i=0;i<str.length;i++) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);
					count++;
				
				}
			}
		
		}
		
	}

}
