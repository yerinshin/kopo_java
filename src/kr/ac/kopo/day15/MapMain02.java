package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;


class MemberInfo {
	private Member m;
	private Car c;
	
	MemberInfo(Member m , Car c){
		//내용
	}
}

class Test{
	public Object[] returnTest() {
		
		Member m = new Member("aaa","111");
		Car c = new Car("bbb", "222");
		
		Object[] arr = new Object[2];
		arr[0] = m;
		arr[1] = c;
		
		return arr;
	}
	
	public Map<String, Object> returnTest2() {
		
		Member m = new Member("aaa","111");
		Car c = new Car("bbb", "222");
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("member", m);
		map.put("car", c);
		
		return map;
	}
	
//	public MemberInfo returnTest3() {
//		Member m = new Member("aaa","111");
//		Car c = new Car("bbb", "222");
//		
//		MemberInfo info = new MemberInfo(m,c);
//		
//		return info();
//		
//	}
}


class Member{
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	//equals() 와 hashCode() 자동으로 만들어줌 ㅋㅋ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	
	
	
	
	/*
	
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
//		name.equals(obj.name);  -->불가능 (x)
		
		//묵시적 형변환된 Object형이 Member형 멤버변수에 접근하기 위해서는 명시적 형변환 필요
		Member mem = (Member)obj;
		
		name.equals(mem.name); //-->(o)
		
		if(name.equals(mem.name) && phone.equals(mem.phone)) {
			result = true;
		}
		
		return result;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + phone.hashCode(); //같은 문자열의 해시코드는 동일하다.
	}	
	
	
	*/
	
	
}

class Car{
	private String name;
	private String id;
	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> carList = new HashMap<Member, Car>();
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("고길동", "010-3333-4444"), new Car("모닝", "34거3434"));
		carList.put(new Member("김길동", "010-5555-6666"), new Car("그랜저", "56나1565"));
		carList.put(new Member("장길동", "010-7777-8888"), new Car("카니발", "78다1278"));
		
		System.out.println("등록 대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다4653"));
		System.out.println("등록 대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "34바4286"));
		System.out.println("등록 대수 : " + carList.size()); //5이고 싶은데 6나옴. 주소로 비교해서 같은 값이지만 새로운 주소로 생성되기 때문에
		
		//map에서 '서로 같다'를 비교할 때, equals도 true이면서 해시코드 값도 동일해야 같은 값이라고 인식하게 한다. //equals와 hashcode오버라이드 필요
		
		
		//객체끼리 비교할 때는 equals비교 
		
		Member m = new Member("길동이", "010-1234-5678");
		Member m2 = new Member("길동이", "010-1234-5678");
		
		if(m.equals(m2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		
		
	}


	

}
