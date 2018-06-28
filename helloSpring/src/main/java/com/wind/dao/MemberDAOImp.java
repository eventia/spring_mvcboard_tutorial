package com.wind.dao;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wind.domain.MemberVO;

@Repository //DAO��� ��� (DAO�� ���������� �νĽ�����)
public class MemberDAOImp implements MemberDAO {
	@Inject // �������踦 �ڵ����� ����(JAVA���� ����) ==@autowired (Spring���� ����)
	private SqlSession sqlSession;
	
	private static final String namespace = "com.wind.mapper.MemberMapper";

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}

}
