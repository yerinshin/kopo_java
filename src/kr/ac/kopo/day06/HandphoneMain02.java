package kr.ac.kopo.day06;

public class HandphoneMain02 {

	
	public static void main(String[] args) {
		
		Handphone[] hpArr = new Handphone[] { 
												new Handphone(), 
												new Handphone(), 
												new Handphone() };
		
		hpArr[0].name = "ȫ�浿";
		hpArr[0].phone = "010-1111-2222";
		hpArr[0].company = "�Ｚ";
		
		hpArr[1].name = "���浿";
		hpArr[1].phone = "010-3333-4444";
		hpArr[1].company = "����";
		
		hpArr[2].name = "�ѱ浿";
		hpArr[2].phone = "010-5555-6666";
		hpArr[2].company = "����";
		
		for(Handphone hp : hpArr) {
			System.out.println("�����ָ� : " + hp.name
								+ ", ��ȭ ��ȣ : " + hp.phone
								+ ", ������ : " + hp.company);
		}
		

	}

}
