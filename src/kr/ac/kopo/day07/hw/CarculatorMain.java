package kr.ac.kopo.day07.hw;

public class CarculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int num1 = cal.getNum();
		int num2 = cal.getNum();
		
		cal.calNum(num1, num2);
		
		cal.primeCheck(num1, num2);
		

	}

}
