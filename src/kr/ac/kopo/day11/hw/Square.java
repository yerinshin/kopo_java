package kr.ac.kopo.day11.hw;

public class Square extends Shape {
	
	Square(int a){
		super(a);
	}

	@Override
	public void getarea(int a) {
		int area = a * a;
		System.out.println("가로 " + a + "의 정사각형 면적은 " + area + "입니다.");
	}	


	@Override
	public void getarea(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
