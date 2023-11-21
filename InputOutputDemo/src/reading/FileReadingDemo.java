package reading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("Input.txt");

			int n =0;
			
			  System.out.println((char)n);
			  
			  while(  (n = reader.read()) != -1 ) {
				  
				  System.out.print((char)n);
			  }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
