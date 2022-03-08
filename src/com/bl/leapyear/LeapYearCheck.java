package com.bl.leapyear;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Year to check \n");
		 int YearToCheck = sc.nextInt();
		 if(YearToCheck % 4 == 0) {
			 System.out.println("This is a Leap year");
		 }
		 else {
			 System.out.println("This is not a Leap year");
		 }
		 sc.close();
	}
}
