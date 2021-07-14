package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.AccountVO;

public class WithdrawUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("---------------------------------------------------------");
		//은행 선택
		String userId = session.getId();
		String bankName = scanStr("출금 할 계좌의 은행명을 입력하세요 ex)하나은행");
		
		List<AccountVO> accountList = accountService.searchAccountByBank(userId, bankName);

		System.out.println("-----------------------------------------------------------");
		System.out.println("\t[ "+ session.getName() +" ] 님의 [ " + bankName + " ] 계좌 목록");
		System.out.println("-----------------------------------------------------------");

		//해당 은행 accountList 출력
		accountService.printAccountList(accountList);
		
		int num = scanInt("출금 하고자 하는 통장에 해당하는 번호를 선택해주세요 : ");
		
		AccountVO account = accountList.get(num-1);
	
		accountService.printSelectedAccount(account);
		
		String accountNum = account.getAccountNum();
		int balance = account.getBalance();
		
		//계좌 선택 후 비번
		System.out.println();
		int money = scanInt("출금 할 금액을 입력하세요 : ");
		
		String pwd = scanStr("계좌 비밀번호를 입력하세요 : ");
		
		//입금실행
		accountService.withdraw(account, accountNum, pwd, balance, money);
		
		
		
	}

}
