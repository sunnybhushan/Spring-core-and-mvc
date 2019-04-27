package Sunny;

import java.util.Scanner;

public class PositiveNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		sc.close();
		if(no>0)
		{
			System.out.println("Number is positive Number "+no);
		}
		else if(no==0) 
		{
			System.out.println("Number is Neutral "+no);
		}
		else
		{
		System.out.println("Number is Negative "+no);	
		}
		
	}
}
