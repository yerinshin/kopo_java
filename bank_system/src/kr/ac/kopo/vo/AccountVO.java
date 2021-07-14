package kr.ac.kopo.vo;

public class AccountVO {
	
	private String accountNum;
	private String accountOwner;
	private String accountPwd;
	private String accountName;
	private String openDate; //계좌 개설일
	private String bankCode;
	private int balance;
//	private String userId;
	
	public AccountVO() {
		super();
	
	}

	public AccountVO(String accountNum, String accountOwner, String accountName, String bankCode, int balance,
			String userId) {
		super();
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.accountName = accountName;
		this.bankCode = bankCode;
		this.balance = balance;
//		this.userId = userId;
	}



	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	

	public String getAccountPwd() {
		return accountPwd;
	}

	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}


	
	public String toString() {
		return "AccountVO [accountNum=" + accountNum + ", accountOwner=" + accountOwner + ", accountName=" + accountName
				+ ", bankCode=" + bankCode + ", balance=" + balance +"]";
	}
	
	
	
	

}
