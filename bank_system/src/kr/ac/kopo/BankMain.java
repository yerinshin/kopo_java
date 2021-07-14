package kr.ac.kopo;

import kr.ac.kopo.ui.UserUI;

public class BankMain {

	public static void main(String[] args) {

				
		UserUI ui = new UserUI();
	
		
		try {
			ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
