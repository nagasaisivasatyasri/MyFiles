package com.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FreqOfElement {

	public static void main(String[] args) {
		String str="this this th thos this th the the eh";
		str=str.toLowerCase();
		String str1[]=str.split(" ");
		List<String> list = Arrays.asList(str1);
        Set<String> distinct = new HashSet<>(list);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
	}// TODO Auto-generated method stub
	}
}

