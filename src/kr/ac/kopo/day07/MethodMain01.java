package kr.ac.kopo.day07;

public class MethodMain01 {
	
	
	/*
	static Car printStar(char c, int cnt){   //참조형도 가능
		
		for(int i = 0; i<cnt ; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		Car car = new Car();
		
		return car;
	}	 
	 */
	
	
	/**\
	 * 
	 * @param c
	 * @param cnt
	 */
	// 반환형 메소드명([매개변수]) {  }
	static int printStar(char c, int cnt){
		
		for(int i = 0; i<cnt ; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		return 20;
	}
	
	
	
	public static void main(String[] args) {
		
		int data = printStar('*', 10);
		
		
		System.out.println("Hello");
		printStar('!', 15);
		System.out.println("Hi");
		printStar('★', 5);
		System.out.println("Good-bye");
		printStar('♡', 5);
	}

}
