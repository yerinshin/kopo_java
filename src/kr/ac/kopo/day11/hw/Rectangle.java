package kr.ac.kopo.day11.hw;

public class Rectangle extends Shape{
	
	Rectangle(int a , int b){
		super(a, b);
	}

	@Override
	public void getarea(int a, int b) {
		int area = a * b;
		System.out.println("가로 " + a + " 세로 " + b + "의 직사각형 면적은 " + area + "입니다.");
	}

	@Override
	public void getarea(int a) {
		// TODO Auto-generated method stub
		
	}



}
