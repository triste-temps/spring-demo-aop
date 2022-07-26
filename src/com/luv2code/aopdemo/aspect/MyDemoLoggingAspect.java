package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @before advice
	
	//@Before("execution(public void add*())")
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n====>>>Executing @Before advice on method");
			 
	}
	
}
