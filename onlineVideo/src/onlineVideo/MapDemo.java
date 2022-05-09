package onlineVideo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map always work in key and value pair
public class MapDemo {

	public static void main(String[] args) 
	{
		Map<String,String>map=new HashMap<>();
		map.put("MyName", "Shivansh");
		map.put("Look", "Handsome");
		map.put("Professional","Doctor");
		
		Set<String> keys=map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key + "  "+map.get(key));
		}

	}

}
