package kr.ac.kopo.day10.hw;

public class Square extends Shape{
	
	Square(int a){
		super("정사각형", a);
	}
	
	@Override
	public void area(int a){
		int sqrArea = a * a;
		setArea(sqrArea);
		super.area(a);
		
	}

}
