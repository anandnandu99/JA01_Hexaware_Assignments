package constructors;

public class TestEmployee {

	public static void main(String[] args) {

		int x = 0;
		String name = null; // x,name,t are local variables
		TestEmployee t = null;

		//System.out.println(x);
		//System.out.println(name);

		Employee e1 = new Employee(101, "king", 9000);
		
		System.out.println(e1.toString());

System.out.println(e1.getEid()+" "+  e1.getEname() +" "+ e1.getSalary());

		
		Employee e2 = new Employee(102, "tom", 4000);
		
		
		System.out.println(e2);
		
		Employee e = new Employee();
				e.setEname("javeed");
				
				System.out.println(e.getEname());
				
				
		
		
		
		
		

	}

}
