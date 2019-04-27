package org.Lazy;

public class SingleTon
{
	private static SingleTon one=null;
	private SingleTon()
	{
		System.out.println("Object is created for singleton");
	}
//	static
//	{
//		one=new SingleTon();
//	}
//	
	public SingleTon getObject()
	{
		if(one==null)
		{
			one=new SingleTon();
		}
		return one;
	}
	public static void main(String[] args) 
	{
		try {
			Class.forName("org.Lazy.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
