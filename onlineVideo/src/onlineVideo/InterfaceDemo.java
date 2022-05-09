package onlineVideo;

interface Abc
{
  void show();	

}

class pqr implements Abc
{
   public void show()
   {
	   System.out.println("Hello Interface......");
   }
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Abc p=new pqr();
		p.show();
	}

}
