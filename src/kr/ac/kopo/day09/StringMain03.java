package kr.ac.kopo.day09;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		
		
		String str = new String("Hello");    // str과 str2의 주소값을 비교 str--> 따로, str2 --> 따로         : 둘이 다르다고 나옴
		String str2 = new String("hello");
		
//		String str = "hello";				// str과 str2는 하나의 문자열 "hello"를 같이 가리킴, str--> 동일한거, str2 --> 동일한거 
//		String str2 = "hello";				// : 둘이 같다고 나옴
		
		
		System.out.println("str : [" +str + "]");
		System.out.println("str2 : [" +str2 + "]");
		
		if(str == str2) {
			System.out.println("str == str2");
		}else {
			System.out.println("str != str2");
		}
		
		//문자열 비교 : 그러므로 equals쓴다.
		str.equals("hello"); //str에 들어있는 문자열과 hello라는 문자열이 같니
		"hello".equals(str); //상수를 왼쪽에 쓰는게 더 일반적
		
		
		boolean bool = str.equals(str2); 		   //----> 대소문자 구별

		if(bool) {
			System.out.println("equals() : str == str2 ");
		}else {
			System.out.println("equals() : str != str2 ");
		}
		
  		boolean bool2 = str.equalsIgnoreCase(str2);  //----> 대소문자 무시
		
		if(bool2) {
			System.out.println("equals() : str == str2 ");
		}else {
			System.out.println("equals() : str != str2 ");
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		str = "hello!!!";
		str2= "helo world";
		
		String sub = "hello";
		bool = str.startsWith(sub); //str에 들어있는 문자열이 sub에 들어있는 문자열로 시작되니?  return  값은 bool형
		
		if(bool) {
			System.out.println("[" + str+ "]은 [" + sub+ "] 문자열로 시작합니다. ");
		}else {
			System.out.println("[" + str+ "]은 [" + sub+ "] 문자열로 시작하지 않습니다. ");
		}
		
		
		System.out.println("---------------------------------------------------------------------");
		//endsWith : 확장자 구별할 때 많이 사용

		str = "hello.txt";
		bool = str.endsWith(".txt");
		
		if(bool) {
			System.out.println("["+str+"]은 텍스트파일입니다. ");
		}else {
			System.out.println("["+str+"]은 텍스트파일이 아닙니다. ");
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		str = "boat";
		str2 = "board";
		
		int compare = str.compareTo(str2);
		if(compare ==0) {
			System.out.println(str + "==" + str2);
		}else if(compare < 0){
			System.out.println(str +" < "+ str2);
		}else { // compare > 0
			System.out.println(str + " > " + str2);
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		str = "boat";
		String[] names = {"강길동", "홍길동", "홍길순", "김길동", "윤길동", "박홍철", "홍길동"};
		
		System.out.println("< 이름이 홍길동인 사람 검색 > ");
		
		for( int i = 0 ; i <names.length; i ++) {
			if(names[i].equals("홍길동")){
			System.out.println(names[i]);
			}
		}
		
		System.out.println("< 홍씨 성을 가진 사람 검색 > ");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
				
		}
		
		System.out.println("< 이름이 길동인 사람 검색 >");
		
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 홍이 포함된 사람 검색 > ");
		
		for( String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		str = "hello world";
		int searchIdx = str.indexOf("o");
		System.out.println("\"o\" indexOf() 위치 : " +searchIdx);
		
		searchIdx = str.indexOf("o", 5); //5번지부터 찾을거야
		System.out.println("\"o\" indexOf() 위치 : " +searchIdx);
		
		searchIdx = str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf() 위치 : " +searchIdx);
		
		str = "hello world";
		char ch = 'l';
		
		// 1>
		System.out.println("< " + str + " 에서 '" + ch + "'위치 >");
		
		searchIdx = str.indexOf(ch);
		while(searchIdx != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
			searchIdx = str.indexOf(ch, searchIdx +1);
		}
		
		//-------------------------------------------------------------------------------------
		// 2> 1과 동일 
		System.out.println("< " + str + " 에서 '" + ch + "'위치 >");
		
		searchIdx = -1;
		while((searchIdx = str.indexOf(ch, searchIdx +1)) != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
		}
		
	}
}
