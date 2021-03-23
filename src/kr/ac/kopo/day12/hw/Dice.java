package kr.ac.kopo.day12.hw;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game{
	
	public int startMenu() {
		int you = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 값 맞추기 게임입니다.\n 주사위를 선택하세요.(1~6값 중 하나)");
		while(true) {
			you = sc.nextInt();
		if(you >=1 && you <=6) {
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
		int me = r.nextInt(6) + 1;
		
		if(me == you) {
			System.out.println("You win");
			returnValue = 1;
		}else {
			System.out.println("You lose");
		}
		
		return returnValue;
	}
	
}
