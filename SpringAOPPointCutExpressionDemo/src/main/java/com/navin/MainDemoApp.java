package com.navin;

import com.navin.dao.AccountDAO;
import com.navin.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainDemoApp {

	public static void main(String[] args) {
       // read spring config java class
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// get membership bean from spring container
		MembershipDAO theMembershipDAO =
				context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		theAccountDAO.addAccount();

		// call the membership business method
		theMembershipDAO.addAccount();

		//CALL THE beforeAddAccountAdvice2 ASPECT. SO THAT IT WILL CALL ALL THE METHODS THAT STARTS WITH ADD* WORDS.
		theMembershipDAO.addSillyMember();

		//CALL THE beforeAddAccountAdvice3 ASPECT. SO THAT IT WILL CALL ALL THE METHODS THAT STARTS WITH ADD* WORDS
		// AND ANY RETURN TYPE.
		theMembershipDAO.addSillyMemberReturnsBoolean();

		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);

		// close the context
		context.close();
	}

}










