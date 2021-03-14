package kr.ac.kopo.day04.hw;

public class HomeWork05 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			int cnt = 0; 
			for (int j = 2 ; j < i ; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			
			if(cnt == 0) System.out.print(i+ "   ");
			
	}

  }
}