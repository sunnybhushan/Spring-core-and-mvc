package Sunny;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args) {
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter the number");
		 * int num=sc.nextInt(); sc.close();
		 */
		int num=153;
		int sum=0;
		int count=isCount(num);
		//System.out.println(count);
		while(num!=0)
		{
			int  rem=num%10;
			sum=sum+rem*count;
			num=num/10;
			System.out.println(sum);
		}
		//System.out.println(sum);

	}
	static int isCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			count++;
		}
		return count;
	}
	static int isPower(int count)
	{
		int p=1;
		while(count!=0)
		{
			p=p*count;
		
			
		}
	
		
		return 0;
		
	}
	

	

}







