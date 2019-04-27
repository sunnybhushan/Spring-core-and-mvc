package Sunny;

import java.util.Scanner;

public class StrongNo
{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt(); //145
		
		
		
	}
	
	int factorial(int num)
	{
		int i = 1,fact=1;int sum=0;
		int rem=num%10;
		while( i<=rem)
		{
			 fact=fact*i;
			 i++;
		}
		sum=sum+fact;
		num=num/10;
		
		return 0;
	}
}
