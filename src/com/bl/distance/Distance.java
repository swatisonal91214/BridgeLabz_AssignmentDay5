package com.bl.distance;

public class Distance {

	public static void main(String[] args) {
		System.out.println("According to the data provided for x and y , Euclidean distance is calculated");
		double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
		double distance = Math.floor(Math.sqrt(Math.pow(x, 2)) +(Math.pow(y, 2)));
		System.out.println("Euclidean distance is :" + distance);
		
	}

}
