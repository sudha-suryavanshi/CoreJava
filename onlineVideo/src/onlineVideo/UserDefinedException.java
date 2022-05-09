package onlineVideo;

public class UserDefinedException {

	public static void main(String[] args) 
	{
		int i=7;
		int j=9;
		
		try
		{
			int k=i/j;
			if(k==0)
				throw new ShivaException("Something went wrong........");
			System.out.println(k);
		}
		catch(ShivaException e)
		{
		  System.out.println(e.getMessage());	
		}
		}
		
		
	}


