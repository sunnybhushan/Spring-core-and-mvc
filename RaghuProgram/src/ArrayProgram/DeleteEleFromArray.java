package ArrayProgram;

import java.util.Scanner;

public class DeleteEleFromArray 
{
public static void main(String[] args) {
	System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("Enter the element of array");
	int ar[]=new int[size];
	for (int i = 0; i < ar.length; i++) 
	{
		ar[i]=sc.nextInt();
	}
	
	System.out.println("Enter the element you want to delete");
	int dele=sc.nextInt();
	sc.close();
	
	for (int i = 0; i < ar.length; i++)
	{
	
		if (dele==ar[i])
		{
			for (int j = i; j < ar.length-1; j++) 
			{
				ar[j]=ar[j+1];
			}
			break;
		}
		
	}
	
	for (int i : ar) {
		System.out.println(i);
	}
	
	
	
	
	
}
}












