package kr.ac.kopo.day14;
/*
 * Set : 순서(x), 중복(x) //---> 순서 없기 때문에 index 사용 불가
 * 장점: 검색 속도 빠름
 * 구현 클래스 : HashSet, TreeSet
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		
		boolean bool = set.add("one");
		System.out.println("\"one\" 데이터 삽입 여부 : " + (bool ? "성공" : "실패"));
		
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		bool = set.add("one"); 		// 안나옴
		System.out.println("\"one\" 데이터 삽입 여부 : " + (bool ? "성공" : "실패"));
		
		/*
		 * set의 전체 데이터 출력 방식
		 * 1. 1.5버전의 for문
		 * 2. iterator() 이용
		 * 3. toArray() 이용
		 */
		
		// TreeSet로 문자열 출력시 사전순(오름차순)으로 출력됨?
		
		
		
		System.out.println("< 1.5버전의 for문 이용 출력 > ");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("< iterator() 이용 출력 > ");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("< toArray() 이용 출력 >");
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
}
