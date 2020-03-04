package com.tyss.scanner;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter row size");
		 int row =s.nextInt(); 
		 System.out.println("Row size is-->"+row);
		 System.out.println("Enter column size");
		 int column=s.nextInt();
		 System.out.println("Column size is-->"+column);
		 int[][]a=new int[row][column];
		 System.out.println("Enter values");
		 for (int i=0;i<row;i++ ) {
			 for(int j=0;j<column;j++) {
				 a[i][j]=s.nextInt();
			 }
		 }
		 System.out.println("Values are-->");
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<column;j++) {
				 System.out.print(a[i][j]+"  ");
			 }
			 System.out.println();
			 }
			 
		 }
		 

	}



