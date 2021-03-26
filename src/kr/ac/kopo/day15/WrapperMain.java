package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
  기본 자료형		Wrapper 클래스						class Boolean{ //참조자료형
  boolean		Boolean										private boolean value; //기본자료형
  char			Character									}
  byte			Byte
  short			Short
  int			Integer
  long			Long
  float			Float
  double		Double
  
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		int i = 123;
		Integer i2 = new Integer(123);
		Integer i3 = 123;			//auto boxing
		int i4 = new Integer(123);	//auto unboxing
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		String str = "10234";
		
		//숫자문자를 정수로
//		int num = Integer.parseInt(str); //리턴타입 : int (기본자료형)  -------> auto boxing되므로 굳이 구분해 쓸 필요없다.
		int num = Integer.valueOf(str);	 //리턴타입 : Integer (참조자료형)
		
		System.out.println(num + 100);		
	}

}
