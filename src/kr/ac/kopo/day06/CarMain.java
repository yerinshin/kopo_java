package kr.ac.kopo.day06;

public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "�ҳ�Ÿ";
		c.price = 3200;
		c.company = "����";
		
		Car c2 = new Car();
		
		c2.name = "K5";
		c2.price = 3000;
		c2.company = "���";
		
		c = c2;
		
		System.out.println("�𵨸� : " + c.name
									+ ", ���� : " + c.price
									+ "����, ������ : "+ c.company);
		
		System.out.println("�𵨸� : " + c2.name
									+ ", ���� : " + c2.price
									+ "����, ������ : "+ c2.company);
	}

}
