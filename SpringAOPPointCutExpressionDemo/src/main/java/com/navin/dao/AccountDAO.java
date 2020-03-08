package com.navin.dao;

import com.navin.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}

	//ADDED FOR beforeAddAccountAdvice4
	public void addAccount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT"+theAccount);

	}

	//ADDED FOR beforeAddAccountAdvice5.
	public boolean doWork() {

		System.out.println(getClass() + ": doWork()");
		return false;
	}
}
