package kr.ac.kopo.day06;

public class HandphoneMain {

	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		hp.name = " ȫ�� �� ";
		hp.phone = "010-1111-2222";
		hp.company= "�Ｚ";
		
		Handphone hp2 = new Handphone();
		hp2.name = "���� ��";
		hp2.phone = "010-3333-4444";
		hp2.company = "����";
		
		Handphone hp3 = new Handphone();
		hp3.name = "�ѱ� ��";
		hp3.phone = "010-5555-6666";
		hp3.company = "����";
		
		System.out.println("=====================================");
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone h : hpArr) {
			System.out.println("�����ָ� : " + h.name 
								+ ", ��ȭ��ȣ : " + h.phone
								+ ", ������ : " + h.company);
		}
			
	
		for(int i =0; i<hpArr.length; i++){
		  	System.out.println("�����ָ� : " + hpArr[i].name 
								+ ", ��ȭ��ȣ : " + hpArr[i].phone
								+ ", ������ : " + hpArr[i].company);
		 
			
		}
		
		
		

	}

}
