package com.navin.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//IT WILL ADD ASPECT ON ALL "addAccount()" METHOD ACROSS THE APPLICATION.
	//@Before("execution(public void addAccount())")
	//public void beforeAddAccountAdvice() {
	//	System.out.println("\n=====>>> Executing @Before advice on addAccount()");
	//}


	//IT WILL ADD ASPECT ON "addAccount()" METHOD OF ACCOUNTDAO CLASS ONLY OF THE APPLICATION.
	//SPECIFIC TO THE METHOD OF CLASS INTO THE APPLICATION
	//@Before("execution(public void com.navin.dao.AccountDAO.addAccount())")
	//public void beforeAddAccountAdvice1() {
	//	System.out.println("\n=====>>> Executing @Before advice on method");
	//}


	//IT WILL ADD ASPECT TO ALL THE METHODS WHICH WILL STARTS WITH ADD* WORD.
	//@Before("execution(public void add*())")
	//public void beforeAddAccountAdvice2() {
	//	System.out.println("\n=====>>> Executing @Before advice on method");
	//}


	//IT WILL ADD ASPECT TO ALL THE METHODS WHCIH WILL STARTS WITH ADD* WORD AND HAVE ANY RETURN TYPE.
	//@Before("execution(* add*())")
	//public void beforeAddAccountAdvice3() {
	//	System.out.println("\n=====>>> Executing @Before advice on method");
	//}


	//IT WILL ADD ASPECT TO ALL THE METHODS WHICH WILL STARTS WITH ADD* WORD AND HAVE ANY RETURN TYPE AND
	//HAVE ACCOUNT OBJECT FOLLOWED BY ANY NUMBER OF PARAMETERS
	//@Before("execution(* add*(com.navin.Account, ..))")
	//public void beforeAddAccountAdvice4() {
	//	System.out.println("\n=====>>> Executing @Before advice on method");
	//}


	//IT WILL ADD ASPECT TO ALL THE METHODS WHICH WILL STARTS WITH ADD* WORD AND HAVE ANY RETURN TYPE AND
	//HAVE ANY NUMBER OF PARAMETERS
	//@Before("execution(* add*(..))")
	//public void beforeAddAccountAdvice5() {
	//	System.out.println("\n=====>>> Executing @Before advice on method");
	//}

	//IT WILL ADD ASPECT TO ALL THE CLASSES AND METHODS UNDER doa PACKAGE AND HAVE
	// ANY RETURN TYPE AND ACCESS ANY PARAMETERS.
	@Before("execution(* com.navin.dao.*.*(..))")
	public void beforeAddAccountAdvice() {

		System.out.println("\n=====>>> Executing @Before advice on method");

	}
}










