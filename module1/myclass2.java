// @project WS3
// @author Christophe
// @version 1.4
// @domain API
// @module Authentication
// @description Classe test 2
// @feature U234, U123

package com.ws.examples;

public class MyClass2 {

	public static void puzzle1() {
		int k = 15;
		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
	}

	public static void puzzle2() {
		int l = 15;

		if (l < 20)
			System.out.println("l<20");//
		if (l > 20)
			System.out.println("l>20");
		else
			System.out.println("Who am I?");//
	}
}