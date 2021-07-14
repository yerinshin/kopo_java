package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.AccountService;
import kr.ac.kopo.service.UserService;
import kr.ac.kopo.vo.UserVO;

public abstract class BaseUI implements IBankUI {
	
	private Scanner sc;
	protected UserService userService;
	protected AccountService accountService;
	protected static UserVO session;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		userService = new UserService();
		accountService = new AccountService();
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

	public static UserVO getSession() {
		return session;
	}

	public static void setSession(UserVO session) {
		BaseUI.session = session;
	}
}
