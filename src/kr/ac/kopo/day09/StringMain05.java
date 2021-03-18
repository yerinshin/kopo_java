package kr.ac.kopo.day09;

public class StringMain05 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str = "";
		
		//str 이 변화하지 못하니까 계속 새로운 공간을 만들어냄 -> 느림 -> 안좋음
		for(int i =0; i< 100000; i ++) {
			str+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) /  1000.0 + "초");
		
		//---------------------------------------------------------------
		
		//StringBuffer 사용
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < 100000; i++) {
			sb.append(i);
			
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) /  1000.0 + "초");
	}

}
