package kr.ac.kopo.day04;

public class LoopMain {
	public static void main(String[] args) {
		
		loop01:for (int i =1; i<=3; i++){
			for(int j=1; j<=5; j++) {
				if(j==3) {
				break loop01; //반복루프, switch문을 벗어나는 데 사용/ 중첩된 반복문을 벗어나는데 사용
			}
				System.out.print(j);
			}
			System.out.println();
		}	
		
		
	}

}
