package onlineVideo;

class A
{
	
  public void show()
  {
	  System.out.println("In A.......");
  }
}
class B extends A
{
public void show()
{
	super.show();
 System.out.println("In B........");
}
}

public class OverridingDemo {

	public static void main(String[] args) 
	{
		B obj=new B();
		obj.show();

	}

}
