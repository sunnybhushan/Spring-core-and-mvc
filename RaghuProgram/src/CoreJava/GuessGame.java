//wajp to guess game//
package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class GuessGame 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number betwn 0 to 9");
		Scanner sc= new Scanner(System.in);
		Random r= new Random();
		int count=0;
		while(true)
		{
		int no=sc.nextInt();
		int rn=r.nextInt(10);
		count++;
		
		if (no==rn)
		{
			System.out.println("Won the game");
			break;
		}
		else 
		{
		System.out.println("Sorry it was: "+rn);	
	
		}
		
		
		
	}
		System.out.println("You entered "+count+" chances");
	
	}}
