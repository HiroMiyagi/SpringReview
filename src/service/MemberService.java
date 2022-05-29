package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {

		String greet(int i);

		int sumOf(int firstNum, int lastNum);
		
		ArrayList<Member> getAll();
	
	
}
