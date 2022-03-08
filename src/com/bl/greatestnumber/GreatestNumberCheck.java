package com.bl.greatestnumber;

import java.util.Scanner;

public class GreatestNumberCheck {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		System.out.println("Enter the second number");
		number2 = sc.nextInt();
		System.out.println("Enter the third number");
		number3 = sc.nextInt();
		GreatestNumberCheck check = new GreatestNumberCheck();
		check.checkGreatest(number1, number2, number3);
		sc.close();
	}

	public void checkGreatest(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest number is " + n1);
		} else if(n2>n1 && n2>n3) {
			System.out.println("Greatest number is " + n2); 
		}else
			System.out.println("Greatest number is" + n3);
			
	}
}
