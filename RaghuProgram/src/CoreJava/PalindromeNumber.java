package CoreJava;

import java.util.Scanner;

public class PalindromeNumber 
{
	static int revNumber(int num)
	 {
		 int rev=0;
		 while(num!=0)
			
		 {
		 int rem=0; 
		 rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
		 }
		 return rev;
	 }
	public static void main(String[] args) 
	{
		System.out.println("Enter  the number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		//PalindromeNumber p= new PalindromeNumber();
		int a=PalindromeNumber.revNumber(num);
		if(a==num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
			
			
			
		
	}	
		
	}
	

