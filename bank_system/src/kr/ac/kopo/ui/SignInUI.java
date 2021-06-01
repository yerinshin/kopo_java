package kr.ac.kopo.ui;

public class SignInUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("================= < 로그인 > ================");
		String id = scanStr("아이디를 입력하세요 : ");
		String password = scanStr("비밀번호를 입력하세요 : ");
		
		
		userService.signIn(id,password);
		
	}

}
