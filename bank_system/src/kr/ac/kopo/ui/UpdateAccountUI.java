package kr.ac.kopo.ui;

import java.util.Map;

import kr.ac.kopo.vo.AccountVO;

public class UpdateAccountUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		String userId = session.getId();
		System.out.println("================= < " + session.getName() + "님 계좌명 변경 > ================");
		String accountNum = scanStr("수정하고자 하는 계좌의 계좌번호를 입력하세요 : "); 
		
		Map<AccountVO, String> accountInfo = accountService.searchAccountByAccNum(userId,accountNum);
		
		for(AccountVO account : accountInfo.keySet()) {
		
		System.out.println("------------< 해당 계좌 정보 >--------------");
		System.out.println("\t은 행 명 : " + accountInfo.get(account));
		System.out.println("\t통 장 명 : " + account.getAccountName());
		System.out.println("\t계 좌 주 : " + account.getAccountOwner());
		System.out.println("\t개 설 일 : " + account.getOpenDate());
		System.out.println("\t잔   액 : " + account.getBalance());
		System.out.println("-----------------------------------------");
		
		System.out.println("현재 통장 이름 : " + account.getAccountName());
		}
		
		
		String newName = scanStr("변경할 이름을 입력하세요 : ");
		
		accountService.updateAccount(accountNum, newName);
		
		
	}

	

}
