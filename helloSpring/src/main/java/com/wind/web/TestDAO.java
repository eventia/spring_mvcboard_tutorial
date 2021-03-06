package com.wind.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.dao.MemberDAO;
import com.wind.domain.MemberVO;

@Controller
public class TestDAO {
	
	@Inject
	private MemberDAO dao;
	
	@RequestMapping(value="/testDAO", method=RequestMethod.GET)
	public void testDAO(){
        MemberVO vo = new MemberVO();
        vo.setUser_id("T010");
        vo.setUser_pw("1234");
        vo.setUser_email("t010@dtudy.com");
        
        dao.insertMember(vo);
    }


}
