package kr.ac.kopo.day10.hw;

public class Circle extends Shape{
	static final double pi = 3.14;
	
	Circle(int a){
		super("원", a);
	}
	
	
	  @Override 
	  public void area(int a){ 
		 double cirArea = a * a * pi;
		 setArea(cirArea); super.area(a);
	  
	  }
	 
}
