package kr.ac.kopo.day11.hw;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void calArea() {
		while (true) {
			print(selectShape());
		}
	}
	
	public int selectShape() {
		int num;
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형" + ", 3. 삼각형, 4. 원) => ");
		num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}

	//2~10 랜덤 수 뽑기
	public int selectLength() {
		Random random = new Random();
		int length = random.nextInt(10 - 2) + 2;
		return length;
	}
	
	Shape s = null;
	
	public void print(int num) {
		int a = 0;
		int b = 0;
		switch(num) {
		case 1 :
			a = selectLength();
			b = selectLength();
			s = new Rectangle(a,b);
			break;
		case 2 : 
			a = selectLength();
			s= new Square(a);
			break;
		case 3 : 
			a = selectLength();
			b = selectLength();
			s= new Triangle(a,b);
			break;
		case 4 :
			a = selectLength();
			s = new Circle(a);
			break;
		}
		
		if( num >=1 && num <=4) {
			if(b ==0) {
				s.getarea(a);
			}else{
				s.getarea(a, b);
				
			}
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
	}
	
	
	

}
