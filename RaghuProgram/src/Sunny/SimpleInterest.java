package Sunny;

import java.util.Scanner;

public class SimpleInterest
	
{
	//double si=0;
	public static void main(String[] args) {
		double si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle:");
		double p = sc.nextDouble();
		System.out.println("Enter the Rate:");
		double r = sc.nextDouble();
		System.out.println("Enter the Time:");
		double t = sc.nextDouble();
		sc.close();
		 si = SI(p, r, t);
		//double si=p*r*t/100;
		System.out.println("Simple Interest:" + si);

	}

	static double SI(double a, double b, double c) {
		double si = a * b * c / 100;
		return si;

}

}
