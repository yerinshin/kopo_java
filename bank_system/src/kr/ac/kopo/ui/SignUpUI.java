package kr.ac.kopo.ui;

import kr.ac.kopo.vo.UserVO;

public class SignUpUI extends BaseUI{
	
	@Override
	public void execute() throws Exception {
		
		System.out.println("================= < 회원가입 > ================");
		String id = scanStr("아이디를 입력하세요 : ");
		String password = scanStr("비밀번호를 입력하세요 : ");
		String name = scanStr("이름을 입력하세요 : ");
		String birthDate = scanStr("생년월일을 입력하세요 ex)99/01/06 : ");
		
		
		UserVO newUser = new UserVO();
		newUser.setId(id);
		newUser.setPassword(password);
		newUser.setName(name);
		newUser.setBirthDate(birthDate);
		
//		UserDAO dao = new UserDAO();
//		dao.signUp(newUser);
		
		userService.signUp(newUser);
		
		System.out.println("회원가입이 완료되었습니다.");
		
		
	}

}
