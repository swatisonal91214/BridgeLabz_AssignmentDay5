package com.bl.functionprgrm;

import java.util.Scanner;

public class DemoArray {
	int[][] number = new int[4] [];
	public DemoArray(int row, int col) {
		number = new int[row][col];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row = sc.nextInt();
		System.out.println("Enter the number of column");
		int col = sc.nextInt();
		DemoArray demoArray = new DemoArray(row, col);
		demoArray.saveNumbers(row, col);
		
		sc.close();
	}
	
	private void saveNumbers(int row, int col) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < row; i++) {
			for(int j =0; j< col; j++) {
				System.out.println("Enter the [" + i +"]["+ j +"]");
				number[i][j] = sc.nextInt();
			}
		}
		sc.close();
			
		}
	}

