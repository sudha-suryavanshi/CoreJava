package onlineVideo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//Set never allow duplicate value
//Treeset always gives value in particular sequence
public class SetDemo {

	public static void main(String[] args) 
	{
		Set<Integer> values=new TreeSet<>();
		//Set<Integer> values=new HashSet<>();
		values.add(35);
		values.add(62);
		values.add(9);
		values.add(100);
		values.add(55);
		values.add(63);
		
		for(Integer i:values)
		{
			System.out.println(i);
		}
			
	}

}
