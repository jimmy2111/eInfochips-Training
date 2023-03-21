package com.einfochips.springtesting.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfochips.springtesting.model.Member;

@Repository
public class MemberRepoClass {
	
	public List<Member> getMembers(){
		List<Member> li = new ArrayList<>();
		li.add(new Member("pateljimi12@gmail.com","Jimmy","8200874276","Male"));
		li.add(new Member("dh@dh.com","Dhrumi","9986475788","Female"));
		return li;
		
	}
	public Member getMemberByEmail(String email) {
		return new Member("pateljimi12@gmail.com","Jimmy","8200874276","Male");
	}

}
