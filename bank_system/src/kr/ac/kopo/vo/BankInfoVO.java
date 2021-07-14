package kr.ac.kopo.vo;

public class BankInfoVO {
	private String bankCode;
	private String bankName;
	
	public BankInfoVO() {
		super();	
	}

	public BankInfoVO(String bankCode, String bankName) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankInfo [bankCode=" + bankCode + ", bankName=" + bankName + "]";
	}
	
	
	
}
