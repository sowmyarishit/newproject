package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap_comparison {

	public static void main(String[] args) {
		HashMap<Object,Object> m=new HashMap<Object,Object>();
		m.put("sowmya", 101);
		m.put("rishit", 101);
		for (Map.Entry<Object, Object> entry : m.entrySet()) {
	//		if(entry.getKey(1)==entry.getKey(2))
			  System.out.println(entry.getValue()+" "+ entry.getKey());
			}
			System.out.println();


	}

}
