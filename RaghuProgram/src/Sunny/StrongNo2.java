package Sunny;

import java.util.Scanner;

public class StrongNo2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		sc.close();
		
		int rs=StrongNo(no);
		if(rs==no)
		{
			System.out.println("No is Strong No: "+rs);
		}
		else
			System.out.println("not a strong no: "+rs);
	}

	private static int StrongNo(int no)
	{
		int sum=0;
		do {
		int rem=no%10;
		 sum=sum+factorial(rem);
		 no=no/10;
		}while(no!=0);
		
		return sum;
	}

	private static int factorial(int rem) 
	{
		int f=1;
		
		while(rem!=0){
			f=f*rem;
			rem--;
		}
		
		return f;
	}
}






