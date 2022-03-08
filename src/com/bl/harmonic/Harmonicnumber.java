package com.bl.harmonic;

import java.util.Scanner;

public class Harmonicnumber {

	public static void main(String[] args) {
		System.out.println("Type the number for which you want to find harmonic number");
		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt();
		double harmonicNumber = 0; 
		if(number == 0) {
			System.out.println("Invalid input!!");
		}else {
			for(int i=1; i<=number; i++) {
				harmonicNumber += (1.0 / i);
			}
		System.out.println("Harmonic number " + number + "is :" +harmonicNumber);
		}
		sc.close();
	}

}
