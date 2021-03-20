package kr.ac.kopo.day10.hw;

public class Triangle extends Shape{
	
	Triangle(int a , int b){
		super("삼각형", a, b);
	}
	
	@Override
	public void area(int a, int b){
		double triArea = (a * b) / 2;
		setArea(triArea);
		super.area(a, b);
		
	}
}
