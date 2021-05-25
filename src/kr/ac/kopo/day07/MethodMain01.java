package kr.ac.kopo.day07;

public class MethodMain01 {
	
	
	/*
	static Car printStar(char c, int cnt){   //李몄“�삎�룄 媛��뒫
		
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
	// 諛섑솚�삎 硫붿냼�뱶紐�([留ㅺ컻蹂��닔]) {  }
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
		printStar('g', 5);
		System.out.println("Good-bye");
		printStar('g', 5);
	}

}
