package kr.ac.kopo.ui;

public class AccountUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		while(true) {
			
			try {
				
				IBankUI ui = null;
				
				int type = menu();
				
				switch(type) {
				case 1:
					//계좌 등록
					ui = new OpenAccountUI();
					break;
				case 2:
					//계좌 수정
					ui = new UpdateAccountUI();
					break;
				case 3:
					ui = new DeleteAccountUI();
					break;
				case 4:
					int searchType = munuAboutSearch();
					
					switch(searchType) {
					case 1:
						ui = new SearchAllAccountListUI();
						break;
					case 2:
						ui = new SearchAccountByAccNumUI();	
						break;
					case 3:
						ui = new SearchAccountByBankUI();
						break;
					}
					break;
				case 5:
					ui = new DepositUI();
					break;
				case 6:
					ui = new WithdrawUI();
					break;
				case 7:
					ui = new TransferUI();
					break;
				case 0:
					ui = new ExitUI();
				}
				
				if(ui != null) {
					ui.execute();
				} else {
					System.out.println("잘못 선택하셨습니다.");
				}
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
	
	private int menu() {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t [ "+ session.getName()+ " ] 님의 통합계좌 관리 시스템");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t 1.계좌 등록");
		System.out.println("\t 2.계좌 수정");
		System.out.println("\t 3.계좌 삭제");
		System.out.println("\t 4.계좌 조회");
		System.out.println("\t 5.입금");
		System.out.println("\t 6.출금");
		System.out.println("\t 7.계좌 이체");
		System.out.println("\t 0.종료");
		System.out.println("-----------------------------------------------------------");
		
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		
		return type;
	}
	
	private int munuAboutSearch() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t 1.내 전체 계좌 조회");
		System.out.println("\t 2.계좌번호로 조회");
		System.out.println("\t 3.은행 별 내 계좌 조회");
		System.out.println("-----------------------------------------------------------");
		
		int searchType = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		
		return searchType;
	}

}
