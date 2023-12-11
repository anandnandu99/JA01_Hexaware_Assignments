package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.deposit())")
	public void authentication() {
		
	}
	@Pointcut("execution(* com.hexaware.aop.service.BankService.withdraw())")

	public void authorization() {
		

	}
	
	
	
	
	

}
