package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map : key, value 의 쌍으로 구성된 데이터의 집홥, 키에 대한 중복(x), 순서(x)
 * 구현 클래스 : HashMap, TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");

		Scanner sc = new Scanner(System.in);
		System.out.println("password 변경 서비스입니다. ");
		System.out.println("ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ID [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {	//문자열과 문자열 비교는 == 사용 불가. equals사용
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);		//id 키에 해당하는 value를 newPassword로 변경
		System.out.println("패스워드가 변경되었습니다.");
		
		/*
		 * map의 출력 ! ! !
		 * 인덱스 존재x -> for문 불가
		 * 1.5for문도 불가
		 * iterator 메소드, toArray메소드 존재하지 않음
		 * 
		 * >> Set<Map.Entry<K,V> entrySet() : (key 와 value) 쌍을 표현하는 Map.Entry집합을 반환 -->사용
		 * 
		 */
		
		System.out.println("<< 전체 회원정보 출력 >>");
		
		/*
		
//		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Set<Entry<String, String>> entrySet = map.entrySet();		//set형
		
		//set형 출력 방법 사용
		for(Entry<String, String> e : entrySet) {
			System.out.println("ID : " + e.getKey() + ", PASSWORD : " + e.getValue());
		}
		
		*/
		
		Set<String> keys = map.keySet(); 	//key 만 모아놓은 set
		for(String key : keys) {
			System.out.println("ID : " + key + ", PASSWORD : " + map.get(key));
		}
		
		
		
	}

}
