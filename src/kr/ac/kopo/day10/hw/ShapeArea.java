package kr.ac.kopo.day10.hw;

import java.util.Random;
import java.util.Scanner;

public class ShapeArea {

	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int a;	//가로
	private int b;	//세로
	private double area;
//	
//	Shape() {
//		
//	}
//	
//	Shape(String name, int a){
//		this.name = name;
//		this.a = a;
//	}
//	
//	Shape(String name, int a, int b){
//		this.name = name;
//		this.a = a;
//		this.b = b;
//	}
	
	
	public void calArea() {
		while(true) {
		selectShape();
		}
	}
	
	public void selectShape() {
		int num;
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형"
								+", 3. 삼각형, 4. 원) => ");
		num = sc.nextInt();
		setLength(num);
	}
	
	public int selectLength() {
		Random random = new Random();
		int length = random.nextInt(10-2) + 2; 
		return length;
	}
	
	public void setLength(int num) {
		if( num == 1 || num ==3) {
//			System.out.println("랜덤하게 2~10사이의 정수 2개를 추출");
			this.a = selectLength();
			this.b = selectLength();
//			System.out.println("가로는 " + this.a + "세로는" + this.b);
			
			if(num ==1) {
				rectangleArea(a,b);
			}else {
				triangleArea(a,b);
			}
		}else if(num ==2 || num == 4) {
//			System.out.println("랜덤하게 2~10사이의 정수 1개를 추출");
			this.a = selectLength();
//			System.out.println("길이는 " + this.a);
			if(num ==2) {
				squareArea(a);
			}else {
				circleArea(a);
			}
		}
	}
	
	
	public void area(String name, int a) {
		System.out.println("가로 " + a + "의 " + name + " 면적은 " + area + "입니다." );
	}
	
	public void area(String name, int a, int b) {
		System.out.println("가로 " + a + ", 세로 " + b + " 의 " + name + " 면적은 " + area + "입니다." );
	}
	
	public void rectangleArea(int a, int b) {	
		this.name = "직사각형";
		this.area = a * b;
		area(name, a, b);
	}
	
	public void squareArea(int a) {
		this.name = "정사각형";
		this.area = a*a;
		area(name, a);
	}
	
	public void triangleArea(int a, int b) {
		this.name = "삼각형";
		this.area = a * b / 2;
		area(name, a, b);
	}
	
	public void circleArea(int a) {
		this.name = "원";
		final double pi = 3.14;
		this.area = 2 * pi * a;
		area(name, a);
	}
}