package Sunny;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Year date:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		sc.close();
		if( (year%400==0) ||( year%100!=0 && year%4==0))
		{
			System.out.println("Leap Year "+ year);
		}
		else
		{
		System.out.println("Not a Leap Year "+ year);	
		}
	}
}
