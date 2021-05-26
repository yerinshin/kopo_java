package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;


//키보드 입력받는 공통의 코드를 가지고 있는 class
//IBoardUI 에 있는 execute()메소드를 실행할 이유가 없다 --> override해야하는 이유 없음
// BaseUI는 ---> 추상클래스로 구성!

public abstract class BaseUI implements IBoardUI {
	
	private Scanner sc;
	protected BoardService service;
	
	
	public BaseUI() {
		sc = new Scanner(System.in);
//		service = new BoardService(); --> (x) / dao가 ui 마다 생성되면 계속 초기화. static써야함
		service = BoardServiceFactory.getInstance(); //새로 생성이 아닌 가져만 오는 것 (연결만 시켜준다) 
	}
	
	protected String scanStr(String msg) { //protected : 같은 패키지 아니어도 상속관계에서 사용
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}

	
}
