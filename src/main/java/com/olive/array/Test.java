package com.olive.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	int[] a= {6,10,0,20,5,15,4};
	System.out.println("***********Element wihout sorting******");
	for(int i1:a) {
		System.out.println(i1);
	}
      Arrays.sort(a);
      System.out.println("***********Element Sorting default sorting order******");
  	for(int i1:a) {
  		System.out.println(i1);
  	}
  	
	}

}
