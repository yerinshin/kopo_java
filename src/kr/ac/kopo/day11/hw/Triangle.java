package kr.ac.kopo.day11.hw;

public class Triangle extends Shape{
	
	Triangle(int a , int b){
		super(a, b);
	}

	@Override
	public void getarea(int a, int b) {
		double area = (a * b) / 2;
		System.out.println("가로 " + a + " 세로 " + b + "의 삼각형 면적은 " + area + "입니다.");
	}

	@Override
	public void getarea(int a) {
		// TODO Auto-generated method stub
		
	}
	
	
}
