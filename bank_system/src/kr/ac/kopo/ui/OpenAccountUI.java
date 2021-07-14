package kr.ac.kopo.ui;

import kr.ac.kopo.vo.AccountVO;

public class OpenAccountUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		System.out.println("======== < " + session.getName() + "님 계좌 생성 > ==========");
		String createdNum = Integer.toString(accountService.createNum()); //랜덤 9자리 수
		String accountOwner = BaseUI.getSession().getName();
	
		String bankCode = scanStr("계좌를 생성할 은행 코드를 입력하세요 (하나:081 , 국민:004, 기업:003, 우리:020, 신한:088) : ");
		
		if(!(bankCode.equals("081")||bankCode.equals("004")||bankCode.equals("003")||bankCode.equals("020")||bankCode.equals("088"))) {
			System.out.println("서비스를 제공하지 않는 은행 코드입니다.");
		} else {
		
		String accountPwd = scanStr("통장 비밀번호를 입력하세요 (4자리) : ");
		int balance = scanInt("계좌 생성 시 입금 할 금액을 입력하세요 (1000원 이상) : ");
		String accountName = scanStr("계좌 별칭을 입력하세요 : ");
		
		String userid = BaseUI.getSession().getId();
		
		String accountNum = bankCode.concat(createdNum);
		
		AccountVO newAccount = new AccountVO();
		newAccount.setAccountNum(accountNum);
		newAccount.setAccountOwner(accountOwner);
		newAccount.setAccountPwd(accountPwd);
		newAccount.setAccountName(accountName);
		newAccount.setBankCode(bankCode);
		newAccount.setBalance(balance);
		
		accountService.openAccount(newAccount, userid);
		}
		
		
		
	}
	
	

}
