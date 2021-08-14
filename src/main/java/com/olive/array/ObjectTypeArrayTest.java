package com.olive.array;

import java.util.Arrays;

public class ObjectTypeArrayTest {

	public static void main(String[] args) {
	String[] a= {"X","Z","A","C"};
	System.out.println("***********Element wihout sorting******");
	for(String i1:a) {
		System.out.println(i1);
	}
      Arrays.sort(a);
      System.out.println("***********Element Sorting default sorting order******");
  	for(String i1:a) {
  		System.out.println(i1);
  	}
  	
  	 Arrays.sort(a,new MyOwnComparator());
     System.out.println("***********Element Sorting Desending Order******");
 	for(String i1:a) {
 		System.out.println(i1);
 	}
  	
	}

}
