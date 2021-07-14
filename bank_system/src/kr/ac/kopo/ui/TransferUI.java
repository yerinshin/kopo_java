package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.AccountVO;

public class TransferUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		//은행 선택
		String userId = session.getId();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t계좌 송금");
		System.out.println("-----------------------------------------------------------");
		
		String bankName = scanStr("어느 은행의 계좌로부터 송금하시겠습니까? ex)하나은행 : ");
		List<AccountVO> accountList = accountService.searchAccountByBank(userId, bankName);

		
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t[ "+ session.getName() +" ] 님의 [ " + bankName + " ] 계좌 목록");
		System.out.println("-----------------------------------------------------------");

		//해당 은행 accountList 출력
		accountService.printAccountList(accountList);
		
		
		
		int num = scanInt("계좌이체를 시행하고자 하는 계좌에 해당하는 번호를 입력해주세요 : ");
		
		AccountVO myAccount = accountList.get(num-1);
		
		//선택 계좌 출력
		accountService.printSelectedAccount(myAccount);
		int money = scanInt("이체 할 금액을 입력해주세요 : "); 
		
		System.out.println();
		System.out.println("[ 받는 사람 ]");
		String transferredBank = scanStr("받는이 계좌의 은행코드를 선택해주세요 (하나:081 , 국민:004, 기업:003, 우리:020, 신한:088) : ");
		String transferredAccNum = scanStr("계좌번호를 입력해주세요 : "); 
		
		String myPwd = scanStr("계좌 비밀번호를 입력하세요 : ");
		
		accountService.transfer(myAccount, myPwd, money, transferredBank, transferredAccNum);
		
		
		
		
		
		
		

		
	}

}
