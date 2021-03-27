package com.yuelchen.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  
@Component 
public class UserServiceAspect {
	
	@Before(value = "execution(* com.yuelchen.service.UserService.createUser(..)) && args(first, last)")
	public void beforeAdvice(JoinPoint joinPoint, String first, String last) {
		// done before execution of UserService for two args (first and last)
		System.out.println(String.format("Before JoinPoint Signature: %s", joinPoint.getSignature()));
		System.out.println(String.format("Before execution of User with first name '%s' "
				+ "and last name '%s'", first, last));
	}
	
	@Before(value = "execution(* com.yuelchen.service.UserService.createUser(..)) && args(first, last, clearance)")
	public void beforeAdvice(JoinPoint joinPoint, String first, String last, int clearance) {
		// done before execution of UserService for two args (first and last)
		System.out.println(String.format("Before JoinPoint Signature (with clearance): %s", joinPoint.getSignature()));
		System.out.println(String.format("Before execution of User with first name '%s' "
				+ ", last name '%s' and clearance '%d'", first, last, clearance));
	}
	
	@Around(value = "execution(* com.yuelchen.service.UserService.displayRegionOffice(..))")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(String.format("Starting Around ProceedingJoinPoint signature: %s", joinPoint.getSignature()));
		
		try {
			joinPoint.proceed();
		} finally {
			System.out.println(String.format("Around ProceedingJoinPoint Hashcode: %d", joinPoint.hashCode()));
		}
		
		System.out.println(String.format("Ending Around ProceedingJoinPoint signature: %s", joinPoint.getSignature()));
	}
	
	@After(value = "execution(* com.yuelchen.service.UserService.createUser(..)) && args(first, last)")
	public void afterAdvice(JoinPoint joinPoint, String first, String last) {
		// done after execution of UserService for two args (first and last)
		System.out.println(String.format("After JoinPoint Signature: %s", joinPoint.getSignature()));
		System.out.println(String.format("After execution of User with first name '%s' "
				+ "and last name '%s'", first, last));
	}
	
	@After(value = "execution(* com.yuelchen.service.UserService.createUser(..)) && args(first, last, clearance)")
	public void afterAdvice(JoinPoint joinPoint, String first, String last, int clearance) {
		// done after execution of UserService for two args (first and last)
		System.out.println(String.format("After JoinPoint Signature (with clearance): %s", joinPoint.getSignature()));
		System.out.println(String.format("After execution of User with first name '%s' "
				+ ", last name '%s' and clearance '%d'", first, last, clearance));
	}
	
	@AfterReturning(value = "execution(* com.yuelchen.service.UserService.displayRegionOffice())")
	public void afterReturningAdvice(JoinPoint joinPoint) {
		System.out.println(String.format("After Returning Signature: %s", joinPoint.getSignature()));
	}
	
	@AfterThrowing(value = "execution(* com.yuelchen.service.UserService.validPay(..))", throwing="e")
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception e) {
		System.out.println(String.format("After Throwing Signature: %s", joinPoint.getSignature()));
		System.out.println(String.format("After Throwing Exception message: %s", e.getMessage()));
	}
}
