package kr.ac.kopo.day11;

public class CastMain01 {
	
	//main 이 static이라서 print()도 static이어야 함
	
	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	*/
	
	public static void print(Parent p) //------> 자동으로 매개변수로 묵시적 형변환 발생: info()만 호출 가능, study or sleep 수행 못함
	{	
		p.info();
		if(p instanceof Child01) {
			Child01 c = (Child01)p;	//명시적 형변환 : study(), sleep() 메소드 사용가능
			c.study();
			c.sleep();
		}else if(p instanceof Child02){
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		}
		
		//instanceof 는 같은 클래스인거나 상속관계일 때만 사용가능
		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
		System.out.println("p instanceof Parent : " + (p instanceof Parent));
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		
		Child01 c01 = new Child01();
		print(c01);
		
		Child02 c02= new Child02();
		print(c02);
		
		Parent p = new Parent();
		print(p);
		
		/*
		Parent p = new Child01();	//묵시적 형변환 발생
		
		System.out.println(p.name + "," + p.age);
		p.info();
		*/
		
		/*
		Child01  c01 =  new Child01();
		System.out.println(c01.name +","+c01.age);
		c01.info();
		
		Parent p = new Parent();
		System.out.println(p.name + "," + p.age);
		p.info();
		*/
	}

}
