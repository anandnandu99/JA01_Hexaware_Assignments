package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import set.Employee;
import set.MyComparator;

public class MapDemo {

	public static void main(String[] args) {


		Map<Integer,String> map = new HashMap<Integer,String>();
		
			map.put(33,"Ravi");
			map.put(15, "Javeed");
			map.put(78, "Tom");
			map.put(20,"Smith");
			map.put(11,"Javeed");
			map.put(33,"Satish");
			
			
			System.out.println(map);
			
			
			Set<Integer>  keySet  =	map.keySet();
			
				
			  for(Integer key: keySet) {
				  
				  System.out.println(key +"  "+ map.get(key));
				  
			  }
			
			
			
	Map<Employee,String>  map2 = new TreeMap<Employee,String>(new MyComparator());
			
			map2.put(new Employee(103, "anand", 3000) , "Delhi");
			map2.put(new Employee(107, "vishal", 5000) ,"Pune");
			map2.put(new Employee(101, "rahul", 4000)  , "Delhi");
			map2.put(new Employee(104, "priya", 9000) , "Hyderabad");
			map2.put(new Employee(104, "priya", 9000) , "Mumbai");
			
			System.out.println(map2);
			

	}

}
