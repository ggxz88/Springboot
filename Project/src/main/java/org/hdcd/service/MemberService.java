package org.hdcd.service;

import java.util.List;

import org.hdcd.domain.Member;

public interface MemberService {

	public void register(Member member) throws Exception;
	
	public Member read(String userId) throws Exception;
	
	public void modify(Member member) throws Exception;
	
	public void remove(String userId) throws Exception;
	
	public List<Member> list() throws Exception;
	
	public int getPoint(String userId) throws Exception;
}