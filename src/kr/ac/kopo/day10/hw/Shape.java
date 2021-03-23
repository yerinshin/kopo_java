package kr.ac.kopo.day10.hw;

import java.util.Random;
import java.util.Scanner;

public class Shape {
	Scanner sc = new Scanner(System.in);

	private String name;
	private int a; // 가로    //원일때는 반지름
	private int b; // 세로
	private double area;

	Shape() {

	}

	Shape(String name, int a) {
		this.name = name;
		this.a = a;
	}

	Shape(String name, int a, int b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}

	void setArea(double area) {
		this.area = area;
	}

	public void calArea() {
		while (true) {
			selectShape();
		}
	}

	public void selectShape() {
		int num;
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형" + ", 3. 삼각형, 4. 원) => ");
		num = sc.nextInt();
		setLength(num);
	}

	//2~10 랜덤 수 뽑기
	public int selectLength() {
		Random random = new Random();
		int length = random.nextInt(10 - 2) + 2;
		return length;
	}
	
	//랜덤 길이 배정
	public void setLength(int num) {
		if (num == 1 || num == 3) {
			this.a = selectLength();
			this.b = selectLength();
			
			if (num == 1) {
				Rectangle rec = new Rectangle(a, b);
				rec.area(a, b);
			} else {
				Triangle tri = new Triangle(a, b);
				tri.area(a, b);
			}
		}else if (num == 2 || num == 4) {
			this.a = selectLength();
			
			if (num == 2) {
				Square sqr = new Square(a);
				sqr.area(a);
			} else {
				Circle cir = new Circle(a);
				cir.area(a);
			}
		}
	}

	
	public void area(int a) {
		System.out.println("가로 " + a + "의 " + name + " 면적은 " + area + "입니다.");
	}

	public void area(int a, int b) {
		System.out.println("가로 " + a + ", 세로 " + b + " 의 " + name + " 면적은 " + area + "입니다.");
	}
	

}
