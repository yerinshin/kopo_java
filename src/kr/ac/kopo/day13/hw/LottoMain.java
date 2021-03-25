package kr.ac.kopo.day13.hw;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		try {
			if(num >45 || num <1) {
				throw new LottoNumberException("LottoNumberException : 1 - 45 사이만 가능합니다. " + num + "은 올바르지 않습니다.");
			}
			System.out.println(num + "을 포함해서 로또 번호들을 추출하겠습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
		
	}

}
