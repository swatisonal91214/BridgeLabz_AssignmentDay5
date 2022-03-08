package com.bl.Quotientremainder;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to divide");
		int dividend = sc.nextInt();
		System.out.println("Enter the number from which division is to be done");
		int divisor = sc.nextInt();
		QuotientRemainder div = new QuotientRemainder();
		div.division(dividend, divisor);
		sc.close();
		
	}
	public void division(int num1, int num2) {
		int quotient = 0;
		int remainder = 0;
		quotient = num1/ num2;
		remainder = num1 % num2;
		System.out.println("Quotient for "+ num1 + " is " + quotient + " and Remainder is " + remainder);
	}
	

}
