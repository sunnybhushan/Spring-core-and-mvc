package Sunny;

import java.util.Scanner;

public class BiggestNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		double no=sc.nextDouble();
		double no2=sc.nextDouble();
		sc.close();
		if(no>no2)
			System.out.println(no+" is Bigger Number than"+no2);
		else {
			System.out.println(no2+" is bigger than "+no);
		}
	}
}
