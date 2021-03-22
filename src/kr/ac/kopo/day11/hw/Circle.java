package kr.ac.kopo.day11.hw;

public class Circle extends Shape{
static final double pi = 3.14;
	
	Circle(int a){
		super(a);
	}

	@Override
	public void getarea(int a) {
		 double area = a * a * pi;
		 System.out.println("반지름 " + a + "의 원 면적은 " + area + "입니다.");
		 
		
	}

	@Override
	public void getarea(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
