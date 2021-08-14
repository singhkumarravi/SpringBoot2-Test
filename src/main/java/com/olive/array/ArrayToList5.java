package com.olive.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList5 {

	public static void main(String[] args) {
		String[] s= {"D","A","S","B"};
		System.out.println("In array format");
		for(String s1:s) {
			System.out.println(s1);
		}
		System.out.println("In  array To List ");
		List<String> list = Arrays.asList(s);
		           System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
