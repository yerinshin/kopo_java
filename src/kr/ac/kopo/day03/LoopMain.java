package kr.ac.kopo.day03;

public class LoopMain {

	public static void main(String[] args) {
		
		int cnt = 1 ;
		
		while(cnt <=5) {
			System.out.println("hello world");
			++cnt;
		}
		System.out.println("");
		for(int i=0; i<5; i++) {
			// for 문 안의 i(변수)는 for문이 끝나면 소멸
			System.out.println("Hello World");
			
		}

	}

}
