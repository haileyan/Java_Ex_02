package com.biz.ex02;

import com.biz.ex02.vo.UserVO;

public class UserExec01 {
	
	public static void main(String[] args) {
		
		UserVO userVO = new UserVO();
		userVO.setStrNum("01001");
		userVO.setStrName("홍길동");
		userVO.setStrGrade("1");
		userVO.setStrAdd("광주광역시");
		userVO.setStrTel("0151545");
		String toString = userVO.toString();
		System.out.println(toString);
		
		
	}
}
