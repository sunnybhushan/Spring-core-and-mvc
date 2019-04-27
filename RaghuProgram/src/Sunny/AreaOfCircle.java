package Sunny;

import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value of Radius:");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		sc.close();
		//double d=AreaOfCircle(r);
		System.out.println("Area of Circle: ");
		
	
	}
	
	public static double AreaOfCircle(double r)
	{
		double a=3.14*r*r;
		return a;
	}
}
