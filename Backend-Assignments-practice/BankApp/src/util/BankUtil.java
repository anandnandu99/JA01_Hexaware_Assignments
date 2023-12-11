package util;

import com.hdfc.service.BankImpTwo;
import com.hdfc.service.IBank;

public class BankUtil { // Factory

	
	public static IBank    getBankObj() { // Factory method
		
		
		return  new BankImpTwo();
		
		
	}
	
	
}
