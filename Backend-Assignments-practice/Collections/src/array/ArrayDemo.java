package array;

public class ArrayDemo {

	public static void main(String   args[]) {


		int   arr[] = {101,102,103,104,105};
		
		System.out.println(arr[0]);
		
		System.out.println("Length "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		int  accounts[] = new int[4];
		   accounts[0] = 1001;
		   accounts[1] = 1002;
		 
		  for (int ac : accounts) {
			
			  System.out.println(ac);
		}
		
		

	}

}
