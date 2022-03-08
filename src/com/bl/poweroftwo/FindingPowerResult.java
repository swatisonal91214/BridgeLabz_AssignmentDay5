package com.bl.poweroftwo;

import java.util.Scanner;

public class FindingPowerResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of power");
		int powerValue = sc.nextInt();
		int result = 2;
		
		if(powerValue == 0 || powerValue == 31) {
			System.out.println("Give some other powervalue");
			result = 1;
		} else {
			System.out.println("Power value of 1 at PowerValue 1" + "\t" + result);
			for(int i = 2; i <= powerValue; i++) {
				result = result *2;
				System.out.println("Power value of 2 at PowerValue " + i + "\t" + result);
			}
			
		  }
		sc.close();
	}
			
}
		
       


