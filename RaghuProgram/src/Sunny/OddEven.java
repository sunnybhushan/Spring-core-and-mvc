package Sunny;

import java.util.Scanner;

public class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		sc.close();
		
		if(no%2==0)
		{
			System.out.println("Number is positive no "+no);
		}
		else
		{
			System.out.println("Number is Odd no "+no);
		}
	}
}
