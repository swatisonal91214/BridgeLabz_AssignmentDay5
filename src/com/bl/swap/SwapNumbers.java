package com.bl.swap;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int firstnumber;
		int secondnumber;
		System.out.println("Enter first number for the Swap Operation");
		Scanner sc = new Scanner(System.in);
		firstnumber = sc.nextInt();
		System.out.println("Enter second number for the Swap Operation");
		secondnumber = sc.nextInt();
		SwapNumbers swap = new SwapNumbers();
		swap.swapNumberSystem(firstnumber, secondnumber);
		
		sc.close();
	}
	
	public void swapNumberSystem(int firstnumber, int secondnumber) {
		int thirdnumber = 0;
		thirdnumber = firstnumber;
		firstnumber = secondnumber;
		secondnumber = thirdnumber; 
		System.out.println("Value after swapping: First number = " + firstnumber + "  Second number: " + secondnumber);
	}

}
