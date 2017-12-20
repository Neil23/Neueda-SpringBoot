package uk.ac.belfast.consituencies.domain;

import java.util.ArrayList;



public class AllMemberList {

	ArrayList<Member> allMembers = new ArrayList<Member>();

	public AllMemberList() {

	}
	
	public AllMemberList(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}

	public ArrayList<Member> getAllMembers() {
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}

}



