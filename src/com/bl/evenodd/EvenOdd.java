package com.bl.evenodd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		

				double number;
				
				System.out.println("Enter the number to check!!");
				Scanner sc = new Scanner(System.in);
				number = sc.nextInt();
				EvenOdd check = new EvenOdd();
				check.evenOddTest(number);
				sc.close();
			}
			
			public void evenOddTest(double number) {
				if(number == 0 || number == 1) {
					System.out.println("Neither even nor odd,Please enter some other number");
				} 
				else {
				if(number%2 == 0) {
					System.out.println("Given number is Even");
				} else {
					System.out.println("Given number is Odd");
				  }
				}
				
			}


}


