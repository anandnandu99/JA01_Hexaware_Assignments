package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();

		set1.add("Don");
		set1.add("Adam");
		set1.add("Ford");
		set1.add("Brown");
		set1.add(null);
		set1.add("javeed");

		System.out.println(set1);

		Set<Employee> set2 = new HashSet<Employee>();

		set2.add(new Employee(103, "anand", 3000));
		set2.add(new Employee(107, "vishal", 5000));
		set2.add(new Employee(101, "rahul", 4000));
		set2.add(new Employee(104, "priya", 9000));

		System.out.println(set2);

		Set<Integer> set3 = new LinkedHashSet<Integer>();

		set3.add(105);
		set3.add(103);
		set3.add(102);
		set3.add(104);

		System.out.println(set3);

	}

}
