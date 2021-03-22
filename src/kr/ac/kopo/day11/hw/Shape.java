package kr.ac.kopo.day11.hw;


public abstract class Shape{
	
	
	private int a;
	private int b;

	
	Shape(){
	
	}
	
	Shape(int a) {
		this.a = a;
	}
	
	
	Shape(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public abstract void getarea(int a, int b);
	public abstract void getarea(int a);
	



	
	
	
}
