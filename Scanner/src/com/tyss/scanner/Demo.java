package com.tyss.scanner;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter your name");
	 String name=s.next();
	 System.out.println("Your name-->"+name);
	 System.out.println("Enter your mobile num");
	 long num=s.nextLong();
	 System.out.println("Mobile num="+num);
	 System.out.println("Employee id ");
	 int id=s.nextInt();
	 System.out.println("My id is--"+id);
	 System.out.println();
	}

}
