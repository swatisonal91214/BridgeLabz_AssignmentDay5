package com.bl.primefactor;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter the number for which you want to find the factors");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.println("The factors are:");
		for(int i = 2; i <= Number; i++) {
			if(Number%i == 0){
				System.out.print(i + "    ");
			}
		}
		sc.close();
	}
	
}
