package com.olive.main;

import java.util.ArrayList;
import java.util.Collections;

import com.olive.test.MyComparator;

public class Test {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(0);
	al.add(5);
	
	al.add(15);
	al.add(20);
	System.out.println(al);
	System.out.println("**********Reverse Element************************");
	Collections.reverse(al);
	
	System.out.println(al);
	Collections.sort(al);
	System.out.println("***********Assending Order**************");
	System.out.println(al);
	System.out.println("********Desending Order*****************");
	Collections.sort(al,new MyComparator());
	System.out.println(al);
	
	
	}

}
