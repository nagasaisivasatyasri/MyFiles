package com.src;
import java.util.Scanner;
public class SortedArray {
private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array=getIntegers(4);
printArray(array);
int []sorted=sortedArray(array);
System.out.println(" ");
printArray(sorted);
	}
public static int[] getIntegers(int size) {
int[] array= new int[size];
for(int i=0;i<size;i++)
{
	array[i]=s.nextInt();
	     
}
return array;
}
public static void printArray(int array[]) {
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
public static int[] sortedArray(int[]  array)
{
	int[] sorted=new int[array.length];
	for(int i=0;i<sorted.length;i++) {
		sorted[i]=array[i];
	}
	boolean issorted=true;
	int temp;
	while(issorted)
	{
		issorted=false;
		for(int i=0;i<array.length-1;i++)
		{
			if(sorted[i]>sorted[i+1]) {
			temp=sorted[i];
			sorted[i]=sorted[i+1];
			sorted[i+1]=temp;
			issorted=true;
		}
		}
	}
	return sorted;
}

}