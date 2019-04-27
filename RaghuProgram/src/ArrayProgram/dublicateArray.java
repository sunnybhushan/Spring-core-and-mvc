package ArrayProgram;

import java.util.HashSet;

public class dublicateArray
{
public static void main(String[] args) 
{
	int a[]= {10,20,30,10,20};
	int b[]= {20,88,54,21,6};
	HashSet<Integer>hs= new HashSet<Integer>();
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < b.length; j++)
		{
			if(b[j]==a[i])
			{
				System.out.print(a[i]+" ");
				hs.add(a[i]);
				break;
			}
		}
	}
	for (int no : hs)
	{
		System.out.println(" "+no);
	}
			
}
}
