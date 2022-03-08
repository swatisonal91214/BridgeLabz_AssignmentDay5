package com.bl.primefactor;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter the number to find the prime values");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.println("The prime numbers are:");
		for(int i = 2; i <= Number; i++) {
			if(primeCheck(i)){
				System.out.print(i + "    ");
			}
		}
		sc.close();
	}
	
	public static boolean primeCheck(int Number) {
		if(Number<=1) {
			return false;
		} 
		for(int i=2; i <= Math.sqrt(Number); i++) {
			if(Number%i == 0) {
			return false;			
			}
		}
		    return true;
		}	
	}



	
	