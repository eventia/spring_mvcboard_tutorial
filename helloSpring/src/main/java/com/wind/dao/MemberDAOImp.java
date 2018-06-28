package com.wind.dao;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wind.domain.MemberVO;

@Repository //DAO라고 명시 (DAO를 스프링에서 인식시켜줌)
public class MemberDAOImp implements MemberDAO {
	@Inject // 의존관계를 자동으로 연결(JAVA에서 제공) ==@autowired (Spring에서 제공)
	private SqlSession sqlSession;
	
	private static final String namespace = "com.wind.mapper.MemberMapper";

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}

}
