// @project WS3
// @author Christophe
// @version 1.2
// @domain API
// @module Authentication
// @description Classe test 1
// @feature U234, U123
// @dependencies myclass2.java

package com.ws.examples;

public class MyClass1 {

	public static void main(String[] args) {

		MyClass2.puzzle1();
		puzzle5();
	}

	private static void puzzle3() {
		int m = 15;

		if(m>20) 
		    if(m<20)
		System.out.println("m>20");
		    else
		System.out.println("Who am I?");
	}


	private static void puzzle5() {
		int number = 5;
		if(number < 0) 
		    number = number + 10; 
		number++; 
		System.out.println(number);
	}

	private static void basicNestedIfElse() {
		int i = 24;
		// i is 25
		// i is 24
		// i is neither 25 or 24
		if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 24) {
			System.out.println("i = 24");
		} else if (i == 23) {
			System.out.println("i = 23");
		} else {
			System.out.println("i != 24 and i !=25 and i !=23");
		}
	}

}