package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		Set<String>  set1 = new TreeSet<String>();
		
		set1.add("Don");
		set1.add("Adam");
		set1.add("Ford");
		set1.add("Brown");

		System.out.println(set1);
		
		
	Set<Employee>  set2 = new TreeSet<Employee>(new MyComparator());
		
		set2.add(new Employee(103, "anand", 3000));
		set2.add(new Employee(107, "vishal", 5000));
		set2.add(new Employee(101, "rahul", 4000));
		set2.add(new Employee(104, "priya", 9000));
		
		System.out.println(set2);
		
		
		
	}

}
