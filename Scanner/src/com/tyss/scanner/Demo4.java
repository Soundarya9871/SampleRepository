package com.tyss.scanner;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		int res=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a--");
		int a = s.nextInt();
		System.out.println("Enter the value of b--");
		int b = s.nextInt();
		System.out.println("Result is--");
		try{
			 res = a/b;
		}catch(Exception z) {
			System.out.println("Cant divide");
		}finally {
			s.close();//not mandatory to use this, but its a good practise 
			System.out.println(",,,,");
		}
		System.out.println(res);
		
		
	}

}
