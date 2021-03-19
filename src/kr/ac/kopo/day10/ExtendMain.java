package kr.ac.kopo.day10;

class One {						//부모 class
	One(){
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One{			//자식 class
	Two(){
//		super(); 생략 되어있지만 가지고 있음
		System.out.println("Two 생성자 호출...");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Three 생성자 호출...");
	}
}

public class ExtendMain {

	public static void main(String[] args) {
		
		new Three();

	}

}
