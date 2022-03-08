package com.bl.windchill;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("According to the t and v values the temperature is calculated");
		double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
		double w = Math.floor(35.74 + (0.6215*t) + ((0.4275*t) - 35.75) * Math.pow(v,0.16));
		System.out.println("The effective temperature is : " + w);
	}

}
