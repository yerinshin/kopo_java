package kr.ac.kopo.service;

import kr.ac.kopo.dao.UserDAO;
import kr.ac.kopo.ui.AccountUI;
import kr.ac.kopo.ui.BaseUI;
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
			 
			BaseUI.setSession(loginedUser); //login 된  id가 있으면 session줌
			
			
		} else {
			System.out.println("로그인 실패!");
		}
		
		if(BaseUI.getSession() !=null) {
			AccountUI accUI = new AccountUI();
			accUI.execute();
		}
	}
	
	
	public int checkID(String id) throws Exception {
		
		return dao.checkID(id);
	}

	
	
}
