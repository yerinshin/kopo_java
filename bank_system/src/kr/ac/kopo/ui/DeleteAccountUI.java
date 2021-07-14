package kr.ac.kopo.ui;


public class DeleteAccountUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("======== < " + session.getName() + "님 계좌 삭제 > ==========");
		
		String userId = session.getId();
		String accountNum = scanStr("삭제 할 계좌 번호(12자리)를 입력하세요 : ");
//		String birthDate = scanStr("생년월일을 입력하세요 ex)98/01/01 : ");
		String pwd = scanStr("삭제 할 계좌 비밀번호를 입력하세요 : ");
		
		accountService.deleteAccount(accountNum, pwd);
		
	}

}
