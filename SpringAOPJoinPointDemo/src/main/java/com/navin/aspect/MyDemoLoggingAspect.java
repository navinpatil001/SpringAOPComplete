package com.navin.aspect;

import com.navin.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.navin.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Signature :" + methodSignature);

		System.out.println("Arguments :");
		Object[] args = theJoinPoint.getArgs();
		for(Object tempArgs : args){
			System.out.println(tempArgs);

			if(tempArgs instanceof Account){
				Account account = (Account) tempArgs;
				System.out.println("Param Name "+account.getName());
				System.out.println("Param Level "+account.getLevel());
			}
		}
		System.out.println("\n=====>>> Executing @Before advice on method");		
	}
	
}










