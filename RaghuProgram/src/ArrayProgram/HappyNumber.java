package ArrayProgram;

import java.util.Scanner;

public class HappyNumber 
{
	public static void main(String[] args) {
		System.out.println("Enter the decimal number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		int sum=Strong(num);
		if(sum==num)
			System.out.println("Its a Strong No "+num);
		else
			System.out.println("It is not Strong No "+num);
	}

	public static int Strong(int num) 
	{  
		int sum=0; 
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int factorial(int rem)
	{
		int fact=1;
		while(rem>1)
		{
			fact=rem*fact;
			rem--;
		}
		return fact;
	}
	
	
	
	

}
