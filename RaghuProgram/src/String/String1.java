package String;

public class String1 
{
	public static void main(String[] args) 
	{
		String n="sunny";
		
		int length=n.length();
		String rev="";
		for(int i=length-1; i>=0; i-- )
		{
			rev=rev+n.charAt(i);
			
		}
		System.out.println(rev);
	}
}



