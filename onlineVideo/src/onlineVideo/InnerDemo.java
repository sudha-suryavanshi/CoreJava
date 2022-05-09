package onlineVideo;




class Outer
{
 int a;
 public void show()
 {	  
	  
 }
 class Inner
 {
	  public void disply()
	  {
		  System.out.println("In diplay");
	  }
 }

}
public class InnerDemo {

	public static void main(String[] args) 
	{
		Outer obj=new Outer();
		
		obj.show();
		Outer.Inner obj1=obj.new Inner();
		obj1.disply();
		

	}

}