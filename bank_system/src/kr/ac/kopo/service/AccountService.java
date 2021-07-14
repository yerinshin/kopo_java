package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import kr.ac.kopo.dao.AccountDAO;
import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.BankInfoVO;


public class AccountService {
	
	private AccountDAO dao;
	
	public AccountService() {
		dao = new AccountDAO();
	}
	
	public int createNum() {
		
		Random r = new Random();
		int num = r.nextInt(899999999) + 100000001;
		
		return num;	
			
	}
	
	public int checkLastAccOpenDate(String loginedId) throws Exception {
		
		return dao.checkLastAccOpenDate(loginedId);
	}
	
	public void openAccount(AccountVO newAccount, String userId) throws Exception {
		
		String pattern = "yy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		newAccount.setOpenDate(sdf.format(new Date()));
		
		if(checkLastAccOpenDate(userId) < 1) {
			System.out.println("계좌 개설은 1달에 1회만 가능합니다. ");
		} else {
			dao.openAccount(newAccount, userId);
			System.out.println("계좌 개설이 완료되었습니다.");
		}
		
	}
	
	public void updateAccount(String accountNum, String newName) throws Exception {
		
		String newAccName = dao.updateAccount(accountNum, newName);
		
		if(newAccName != null) {
			System.out.println("\'" + newAccName + "\' 으로 계좌명이 변경되었습니다.");
		}else {
			System.out.println("계좌명 변경에 실패하였습니다.");
		}
	
	}
	
	public void deleteAccount(String accountNum, String pwd) throws Exception {
		
		int cnt = dao.deleteAccount(accountNum, pwd);
		if( cnt == 1 ) {
		System.out.println("계좌를 삭제하였습니다.");
		}
	}
	
	//사용자 전체 계좌 list 조회
	public Map<AccountVO, BankInfoVO> searchAllAccountList(String userId) throws Exception {
//		List<AccountVO> accountList = dao.SearchAllAccountList(userId);
		return dao.searchAllAccountList(userId);
	}
	
	//계좌번호로 계좌정보 조회
	public Map<AccountVO, String> searchAccountByAccNum(String userId, String accountNum) throws Exception {
		
		AccountVO account = null;
		String bankName = null;
		Map<AccountVO,BankInfoVO> allAccountListMap = searchAllAccountList(userId);
		
		Map<AccountVO, String> accountInfo = null;
		
		
		for (AccountVO a : allAccountListMap.keySet()) {
			if(a.getAccountNum().equals(accountNum)) {
				accountInfo = new HashMap<AccountVO, String>();
				account = a;
				bankName = allAccountListMap.get(account).getBankName();
				accountInfo.put(account, bankName);
				break;
			}
		}
		
		return accountInfo;
		
	}
	//은행으로 계좌 list조회
	public List<AccountVO> searchAccountByBank(String userId, String bankName) throws Exception {
		
		Map<AccountVO,BankInfoVO> allAccountListMap = searchAllAccountList(userId);
		
		List<AccountVO> accountList = new ArrayList<>();
		
		for(AccountVO account : allAccountListMap.keySet()) {
			if(allAccountListMap.get(account).getBankName().equals(bankName)) {
				accountList.add(account);
			}
		}
		return accountList;
	}
	
	
	public void deposit(AccountVO account, String accountNum , String pwd, int balance,  int money) throws Exception {

		int addedBalance = balance + money;
		int newBalance = dao.deposit(accountNum, pwd, addedBalance);
		
		if(newBalance == -1) {
			System.out.println("입금 실패했습니다.");
		}else {
			System.out.println("해당 계좌에 " +  money +"원 입금 되었습니다.");
			System.out.println();
			
			
			System.out.println(" 통장명\t    계좌번호\t   개설일\t\t  잔액");
			System.out.println(account.getAccountName() + "\t  " 
					+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + newBalance);
		}
		
		
	}
	
	public void withdraw(AccountVO account, String accountNum , String pwd, int balance,  int money) throws Exception {
		
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			int balanceAfterWithdraw = balance - money;
			int newBalance = dao.withdraw(accountNum, pwd, balanceAfterWithdraw);
			
			if(newBalance == -1 ) {
				System.out.println("출금 실패했습니다.");
			}else {
				System.out.println("해당 계좌에서 " +  money +"원 출금 되었습니다.");
				System.out.println();
				
				System.out.println(" 통장명\t    계좌번호\t   개설일\t\t  잔액");
				System.out.println(account.getAccountName() + "\t  " 
						+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + newBalance);
			}
			}
		
		
	}
	
	public void transfer(AccountVO myAccount, String myPwd, int money, String transferredBank, String transferredAccNum) throws Exception {
		
		String myAccountNum = myAccount.getAccountNum();
		int myBalance = myAccount.getBalance();
		String accountPwd = myAccount.getAccountPwd();
		AccountVO transferredAccount = null;
		
		if(myBalance < money) {
			System.out.println("이체 할 잔액이 부족합니다.");
		} else if (!(accountPwd.equals(myPwd))){
			System.out.println("비밀번호가 일치하지 않습니다.");
		}else {
	
			int myBalanceAfterTransfer = myBalance - money;
			transferredAccount = dao.transfer(myAccountNum, myPwd, myBalanceAfterTransfer, money, transferredBank, transferredAccNum);
			System.out.println();
			System.out.println("[받는이 정보]");
			System.out.println("받는 사람 : " + transferredAccount.getAccountOwner());
			System.out.println("계좌 번호 : " + transferredAccount.getAccountNum());
			System.out.println();
			System.out.println("[ " +transferredAccount.getAccountOwner() + " ] 님께 " + money + "원 송금 완료!");
			System.out.println();
			System.out.println("내 계좌 남은 잔액 : " + myBalanceAfterTransfer);
		}
		
//		return transferredAccount;
	}
	

	public void printSelectedAccount(AccountVO account) {
		
		System.out.println("------------------ < 선택한 계좌 > --------------------");
		System.out.println(" 통장명\t    계좌번호\t   개설일\t\t 잔액");
		
		System.out.println(account.getAccountName() + "\t  " 
				+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + account.getBalance());
	}
	
	public void printAccountList(List<AccountVO> accountList) {
		
		System.out.println("번호\t 계좌명\t    계좌번호\t   개설일\t\t 잔액");
		System.out.println("-----------------------------------------------------------");
		
		if(accountList.size() ==0 ) {
			System.out.println("\t조회할 계좌가 존재하지 않습니다.");
		} else {
			int num =1;
			for(AccountVO account : accountList) {
				System.out.println(" "+num +"\t" + account.getAccountName() + "\t  " 
								+ account.getAccountNum() + "\t " + account.getOpenDate() + "\t " + account.getBalance());
				num++;
			}
		}
		
		System.out.println();
		
	}
	
}









