package kr.ac.kopo.ui;

import java.util.Map;

import kr.ac.kopo.vo.AccountVO;

public class SearchAccountByAccNumUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		String userId = session.getId();
		
		
		String accountNum = scanStr("조회 할 계좌번호를 입력하세요 : ");
		Map<AccountVO, String> accountInfo = accountService.searchAccountByAccNum(userId,accountNum);
		
		if(accountInfo == null) {
			System.out.println("등록된 계좌번호가 아닙니다.");
		}else {
			
			for(AccountVO account : accountInfo.keySet()) {
				
				System.out.println("-----------------------------------------------------------");
				System.out.println("\t은 행 명 : " + accountInfo.get(account));
				System.out.println("\t통 장 명 : " + account.getAccountName());
				System.out.println("\t계 좌 주 : " + account.getAccountOwner());
				System.out.println("\t개 설 일 : " + account.getOpenDate());
				System.out.println("\t잔   액 : " + account.getBalance());
				System.out.println("-----------------------------------------------------------");
			}
			
		}
		
	
	}

}
