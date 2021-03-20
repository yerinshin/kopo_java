package kr.ac.kopo.day10.hw;

public class Rectangle extends Shape{
	
	
	Rectangle(int a , int b){
		super("직사각형", a, b);
	}
	
	@Override
	public void area(int a, int b){
		int recArea = a * b;
		setArea(recArea);
		super.area(a, b);
		
	}
}
