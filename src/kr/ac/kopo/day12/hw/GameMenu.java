package kr.ac.kopo.day12.hw;

import java.util.Scanner;

public class GameMenu {
	private int totalGame =0;
	private int win =0;
	private int draw =0;

	void startMenu(){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("게임을 선택하세요.\n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
			String str = sc.nextLine();
			Game game = null;
			if(str.charAt(0) == 'A') {
				totalGame++;
				game = new ScissorsRockPaper();
				int you = game.startMenu();
				int result = game.startGame(you);
				
				if(result ==-1) draw++;
				else win += result;
			}else if(str.charAt(0) == 'B'){
				totalGame++;
				game = new Dice();
				win += game.startGame(game.startMenu());
			}else if(str.charAt(0) == 'C') {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은"+ win +"승 " + (totalGame-win-draw) +"패 "+ draw + "무입니다.");
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
	}
	
	
}
