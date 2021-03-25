package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 	List : 순서(o), 중복(o)
 	구현 클래스 : ArrayList, LinkedList
 	
 	- add() : 데이터 입력
	- get(int index) : 데이터 추출
	- size() : 크기 반환
	- remove(int i ) : 인덱스 위치의 데이터를 삭제 (인덱스 빈 곳 채워짐)
	- remove(Object o) : 동일한 데이터를 삭제 ex) list.remove("봄");
	    → 인덱스 가장 앞쪽의 동일 데이터 1개만 삭제 
	- clear() : 모든 데이터를 삭제
	- contains(Object o) : boolean형 반환. 해당 데이터 있는지 없는지 판별
	- isEmpty() : 데이터 존재하는지 체크 / size =0인지 판별
	- addAll(Collection c) : 두개의 리스트 데이터를 합쳐서 하나로 만듬. sublist의 데이터가 뒤에 add됨
	- iterator() : Iterator 인터페이스 객체 반환
 */


public class ListMain {

	public static void main(String[] args) {
		
//		List list = new ArrayList(); 						//1.5미만 방식(generic 츨현 전)
//		List<String> list = new ArrayList<String>(); 		// 1.5버전의 Generic사용
		List<String> list = new ArrayList<>(); 				//1.7버전의 Generic사용. 뒤쪽 type생략 가능 
		
//		list.add(10); ---> error! Object가 String으로 바뀌어있음
		
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println("리스트의 원소 개수 : " + list.size());
		System.out.println();
		
		list.add("one");
		System.out.println("add('one') 후 리스트의 원소 개수 : " + list.size());
		System.out.println();
		/*
		 * list의 전체 데이터 출력
		 * 1. index를 이용한 get() 메소드 이용
		 * 2. 1.5버전의 for문 이용
		 * 3.toArray() 메소드 이용 	 -----------> 잘 안씀
		 */
		
		System.out.println("< get() 메소드를 이용한 출력 > ");
		for(int i =0; i< list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("< toArray() 메소드 이용한 출력 >");
		Object[] arr = list.toArray(); 	//Generic따르지 않음. 리턴타입이 배열형태로 나옴
		System.out.println(Arrays.toString(arr));
		
		
		/*
		 * Iterator(순환자) 주요 메소드
		 * - hasNext() : 추출한 다음데이터의 존재여부 판단
		 * - next() : 데이터 추출
		 */
		
		System.out.println("<iterator() 메소드 이용 출력 > ");
		Iterator<String> ite = list.iterator(); 	//list에 접근하는 iterator 객체를 만듬
		while(ite.hasNext()) {
			System.out.print(ite.next() + " "
					);
		}
		
	}
	
	

}
