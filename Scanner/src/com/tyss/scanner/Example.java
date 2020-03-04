package com.tyss.scanner;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter the num");
		for (int i = 0; i <= 5; i++) {
			a[i] = s.nextInt();
		
		System.out.println("the num");
	//	for (int i = 0; i <= 5; i++) {
			System.out.println(a[i]);
		}

	}
}