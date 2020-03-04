package com.tyss.scanner;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = s.nextInt();
		System.out.println("Row size is-->" + row);
		System.out.println("Enter column size");
		int column = s.nextInt();
		System.out.println("Column size is-->" + column);
		int[][] b = new int[row][column];
		System.out.println("Enter values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = s.nextInt();
			}

		}
		System.out.println("Values are--");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println();
			}
		}

	}
}

