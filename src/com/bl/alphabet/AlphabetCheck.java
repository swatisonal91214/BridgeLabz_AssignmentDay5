package com.bl.alphabet;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		char alphabet;
		System.out.println("Please enter the Alphabet to check");
		Scanner sc = new Scanner(System.in);
		alphabet = sc.next().charAt(0);
		AlphabetCheck check = new AlphabetCheck();
		check.checkAlphabet(alphabet);
		sc.close();
	}
	
	public void checkAlphabet(char alphabet) {
		
		if(alphabet == 'A' || alphabet == 'E'|| alphabet == 'I' || alphabet == 'O' || alphabet == 'U' || alphabet == 'a' || alphabet == 'e'|| alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ) {
			System.out.println("Given Alphabet is a vowel");
		} 
		else {
			System.out.println("Given Alphabet is a Consonant");
		}
		
	}

}
