package kr.ac.kopo;

import kr.ac.kopo.ui.BankUI;

public class BankMain {

	public static void main(String[] args) {
		
		BankUI ui = new BankUI();
	
		
		try {
			ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
