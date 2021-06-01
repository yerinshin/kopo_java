package kr.ac.kopo.service;

import kr.ac.kopo.dao.UserDAO;
import kr.ac.kopo.vo.UserVO;

public class UserService {
	
	private UserDAO dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	public void signUp(UserVO newUser) throws Exception {
		
		dao.signUp(newUser);
		
	}
	
	public void signIn(String id, String password) throws Exception {
		
		UserVO loginedUser = dao.signIn(id, password);
		
		if(loginedUser != null) {
			System.out.println("[ 아이디 : " + loginedUser.getId() + ", 이름 : " + loginedUser.getName() + " 님 ] 로그인되었습니다.");
		} else {
			System.out.println("로그인 실패!");
		}
	}
	
	public void checkID(String id ) throws Exception {
		
		if(dao.checkID(id)==1) {
			System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요.");
			
		}
		
	}
	
	
}
