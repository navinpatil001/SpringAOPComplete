package com.navin.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
	}

	// ADDED FOR beforeAddAccountAdvice2 ASPECT FOR (*) WILDCARD ASPECT MATCHING.
	public void addSillyMember() {

		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT : addSillyMember");

	}

	// ADDED FOR beforeAddAccountAdvice3 ASPECT FOR (*) WILDCARD MATCHING AND MATCHES WITH ANY RETURN TYPE.
	public boolean addSillyMemberReturnsBoolean() {

		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT : addSillyMemberReturnsBoolean");

		return true;
	}


	// ADDED FOR beforeAddAccountAdvice5
	public void goToSleep() {

		System.out.println(getClass() + ": I'm going to sleep now...");

	}
}
