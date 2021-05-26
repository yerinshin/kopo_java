package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		while(true) {
			try { //예외발생해도 반복 실행할 수 있도록 try/catch
				
			IBoardUI ui = null;
			int type = menu();
			
			switch(type) {
			case 1:
				ui = new SearchAllUI();
				break;
			case 2:
				ui = new SearchOneUI();
				break;
			case 3:
//				AddUI add = new AddUI();
//				add.execute();
				ui = new AddUI(); //AddUI로 묵시적 형변환
				// ui.execute(); // while문 밖에서 한번에 실행
				
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				ui = new DeleteUI();
				break;
			case 0 :
				ui = new ExitUI();
				break;
			}
			
			if(ui != null)
				ui.execute();
			else
				System.out.println("잘못선택하셨습니다.");
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private int menu() { //외부에서 menu볼 일 없음
		
		System.out.println("-------------------------------");
		System.out.println("\t 게시판 관리 프로그램");
		System.out.println("-------------------------------");
		System.out.println("\t1. 전체 게시글 조회");
		System.out.println("\t2. 글 번호 조회");
		System.out.println("\t3. 새글 등록");
		System.out.println("\t4. 게시글 수정");
		System.out.println("\t5. 게시글 삭제");
		System.out.println("\t0. 종료");
		System.out.println("-------------------------------");
	
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		
		
		return type;
	
	}

}
