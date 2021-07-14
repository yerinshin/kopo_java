package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.AccountVO;

public class SearchAccountByBankUI extends BaseUI{
	
	@Override
	public void execute() throws Exception {
		String userId = session.getId();
		String bankName = scanStr("보유한 계좌를 조회할 은행명을 입력하세요 ex)하나은행"); 
		
		List<AccountVO> accountList = accountService.searchAccountByBank(userId, bankName);

		System.out.println("-----------------------------------------------------------");
		System.out.println("\t[ "+ session.getName() +" ] 님의 [ " + bankName + " ]계좌 조회");
		System.out.println("-----------------------------------------------------------");
		System.out.println("통장명\t    계좌번호\t   개설일\t\t 잔액");
		System.out.println("-----------------------------------------------------------");
		
		if(accountList.size() ==0 ) {
			System.out.println("\t조회할 계좌가 존재하지 않습니다.");
		} else {
			for(AccountVO account : accountList) {
				System.out.println(account.getAccountName() + "\t  " 
								+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + account.getBalance());
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		
	}
	
	
}
