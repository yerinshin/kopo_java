package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.UserService;

public abstract class BaseUI implements IBankUI {
	
	private Scanner sc;
	protected UserService userService;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		userService = new UserService();
	}
	
	protected String scanStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}
}
