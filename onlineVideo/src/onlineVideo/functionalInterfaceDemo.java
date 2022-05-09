package onlineVideo;
//After 1.7 version we can declare the interface using default keyword but not before that
 
@FunctionalInterface
interface Demo
{
   void show();
   
   default void abc()
   {
	   System.out.println("Functionl interface!!!!!");
   }

}

class implementer implements Demo
{
   public void show()
   {
	   
	   System.out.println("calling interface method!!!!!!!");
   }

}

public class functionalInterfaceDemo {

	public static void main(String[] args) 
	{
		Demo d1=new implementer();
		d1.abc();
		d1.show();
		

	}

}
