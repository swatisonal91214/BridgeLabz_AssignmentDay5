package com.bl.cubicrunning;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		System.out.println("Enter the number of integers to be entered");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int index = i+1;
			System.out.println("Enter the integer number  " + index  );
			arr[i]= sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			int index = i+1;
			System.out.println("Integer number  at " + index + " is : " + arr[i] );
		}
		
		for(int i = 0; i<N-2; i++) {
			for(int j = 0; j < N-1; j++) {
					for(int k = 0; k < N; k++) {
						int sum = arr[i]+arr[j]+arr[k];
						if(sum == 0) {
							System.out.println("Triplets are arr " + arr[i] + " " + arr[j]+ " " + arr[k] );
						}
				}
			}
		}
		sc.close();

	}

}
