package kr.ac.kopo.ui;

public class UserUI extends BaseUI {

	@Override
	public void execute() throws Exception {
			
		while(true) {
			try {
				
				IBankUI ui = null; 
				
				int type = menu();
				
				switch(type) {
				case 1: 
					//회원가입
					ui = new SignUpUI();
					break;
				case 2:
					//로그인
					ui = new SignInUI();
					break;
				case 0:
					ui = new ExitUI();
					break;
				}
				
				if(ui != null) {
					ui.execute();
				}else {
					System.out.println("잘못 선택하셨습니다.");
				}
		
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		} 
	

	
	private int menu() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("\t 통합계좌 관리 시스템");
		System.out.println("----------------------------------------------------------");
		System.out.println("\t 1.회원가입");
		System.out.println("\t 2.로그인");
		System.out.println("\t 0.종료");
		System.out.println("----------------------------------------------------------");
		
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		
		return type;
	}
	
}
