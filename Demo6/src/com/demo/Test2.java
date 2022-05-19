package com.demo;

import java.util.Scanner;

public class Test2 {
	
	void greet1() {
		System.out.println("Hello");
	}
	
	void greet2() {
		System.out.println("How are you");
	}
	
	void greet3() {
		System.out.println("Please enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Have a great day "+name+"!!");
		sc.close();
	}

}
