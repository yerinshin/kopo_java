package kr.ac.kopo.day03.exam;

/*
 * 3-20사이의 라인수를 입력하세요.
 * 짝수 입력하면 : 홀수로 입력하세요 or
 * 				숫자 +1 을 해서 홀수로 자동 만들기
 */

public class ExamMain {

	public static void main(String[] args) {
		System.out.println("1>");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("2>");

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j < i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("3>");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("4>");

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("5>");

		
		// [방법 1] -- for 5, if 1
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j < i; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= i - 4; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}
		
		System.out.println();

		// [방법 2] -- for 3, if 3

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if (j < i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j < 10 - i ? "-" : "*"); //if나 마찬가지
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//[방법3] for 3개, if 1개
	
		int star = 5;
		for(int i =1; i<= 9; i++) {
			for(int j =1; j<= 5 - star; j++) {
			System.out.print(' ');
			}
			for(int j =1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			if(i<5) {
				star--;
			}else {
				star++;
			}
		}
		
		System.out.println();
		
		//[방법 4] - 시작하는 열의 위치로 생각
		
		int startCol =1;
		for( int i = 1; i<=9; i++) {
			for(int j =1; j<=5; j++) {
				if(j<startCol) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(i<5) {
				startCol++;
			}else {
				startCol--;
			}
		}
		
		
	}
}
