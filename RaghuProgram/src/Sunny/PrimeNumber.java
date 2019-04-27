package Sunny;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp=0;
		for(int i=2; i<=no/2; i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp>0)
		{
			System.out.println("Not a prime no:"+no);
		}
		else if (no==1)
		{
			System.out.println("not a prime no");
		}
		
		else
		{
			System.out.println("A prime nuber: "+no);
		}
	}
}
