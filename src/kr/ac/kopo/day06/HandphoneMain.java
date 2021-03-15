package kr.ac.kopo.day06;

public class HandphoneMain {

	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		hp.name = " 홍길 동 ";
		hp.phone = "010-1111-2222";
		hp.company= "삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name = "윤길 동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "한길 동";
		hp3.phone = "010-5555-6666";
		hp3.company = "엘지";
		
		System.out.println("=====================================");
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone h : hpArr) {
			System.out.println("소유주명 : " + h.name 
								+ ", 전화번호 : " + h.phone
								+ ", 제조사 : " + h.company);
		}
			
	
		for(int i =0; i<hpArr.length; i++){
		  	System.out.println("소유주명 : " + hpArr[i].name 
								+ ", 전화번호 : " + hpArr[i].phone
								+ ", 제조사 : " + hpArr[i].company);
		 
			
		}
		
		
		

	}

}
