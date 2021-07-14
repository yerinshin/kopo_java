package kr.ac.kopo.ui;

import java.util.Map;

import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.BankInfoVO;

public class SearchAllAccountListUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		String userId = session.getId();
		Map<AccountVO,BankInfoVO> accountInfoMap = accountService.searchAllAccountList(userId);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t[ "+ session.getName() +" ] 님의 전체 계좌 조회");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" 은행명\t  통장명\t    계좌번호\t   개설일\t\t 잔액");
		System.out.println("-----------------------------------------------------------");
		
		if(accountInfoMap.size() ==0 ) {
			System.out.println("\t조회할 계좌가 존재하지 않습니다.");
		} else {
			for(AccountVO account : accountInfoMap.keySet()) {
				System.out.println(accountInfoMap.get(account).getBankName() + "\t " + account.getAccountName() + "\t  " 
								+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + account.getBalance());
			}
		}
		
		System.out.println("-----------------------------------------------------------");
	
		
	}

}
