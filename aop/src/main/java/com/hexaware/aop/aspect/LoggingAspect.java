package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.hexaware.aop.service.BankService.*())")
	public void logs() {
		System.out.println(" before bank servicesApplication logs");
	}
	@After("execution(* com.hexaware.aop.service.BankService.*())")
	public void afterlogs() {
		System.out.println(" before bank servicesApplication logs");
	}

}
