package com.navin.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyMember() {

		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT : addSillyMember");

	}

	public void goToSleep() {

		System.out.println(getClass() + ": I'm going to sleep now...");

	}
}
