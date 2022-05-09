package onlineVideo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) 
	{
	 List<Integer> values=new ArrayList<>();
	  values.add(5);
	  values.add(6);
	  values.add(2);
	  values.add(0,3);
	  values.add(10);
	  
	 Collections.sort(values);
	 //Collections.reverse(values);
	  
	  for(Integer o: values)
	  {
		  System.out.println(o);
	  }
	  
//	  for(int i=0;i<values.size();i++)
//	  {
//		  System.out.println(values.get(i));
//	  }
	  
//	  Iterator it=values.iterator();
//	  while(it.hasNext())
//	  {
//		  System.out.println(it.next());
//	  }
//	  
	}

}
