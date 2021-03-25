package kr.ac.kopo.day12.hw;

import java.util.Random;

import java.util.Scanner;

public class ScissorsRockPaper implements Game{

	final static int SCISSOR = 1;
	final static int ROCK =2;
	final static int PAPER = 3;
	
	public int startMenu() {
		int you = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다.\n 가위바위보 중 하나를 선택하세요.\n(1:가위, 2:바위, 3:보)");
		while(true) {
			you = sc.nextInt();
		if(you >=1 && you <=3) {
			break;
		}else {
			System.out.println("다시 입력하세요.");
		}
		}
		return you;
	}
	
	
	@Override
	public int startGame(int you) {
		int returnValue = 0;
		
		Random r = new Random();
		int me = r.nextInt(3)+1;
		if( me == you) {
			System.out.println("비겼습니다.\n");
			returnValue = -1;
		}else if(me ==SCISSOR) {
			if(you ==ROCK) {
				System.out.println("You win\n");
				returnValue =1;
			}else System.out.println("You lose\n");
			
		}else if(me ==ROCK) {
			if(you ==PAPER) {
				System.out.println("You win\n");
				returnValue =1;
			}else System.out.println("You lose\n");

		}else if(me == PAPER){
			if(you == SCISSOR) {
				System.out.println("You win\n");
				returnValue =1;
			}else System.out.println("You lose\n");

		}
		return returnValue;
	}
	
	
	
}
