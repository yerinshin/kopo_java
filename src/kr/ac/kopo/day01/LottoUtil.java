//�����(�ּ���, ��Ű��, ����Ʈ, Ŭ���� ����)
package kr.ac.kopo.day01;

import java.util.Random;

/**
 * (����ȭ �ּ�)
 * �ζǿ� ���õ� ����� �����ϴ� ��� Ŭ����
 * 
 * @author ������
 *
 */

//���� Ŭ����
public class LottoUtil {
	// �����(�������, �޼ҵ� ����Ŭ����)
	
	//�������
	int lottoNum ;
	
	//�޼ҵ�
	/**
	 * ������ �ζ� Ȯ���� ������ִ� �޼ҵ�
	 */
	public void todayLotto() {
		Random r = new Random() ;
		System.out.println("������ �ζ� Ȯ��: "+r.nextInt(101) + "%�Դϴ�.") ;
									//101�� �������� �� ���� �� �ִ� ������ ��(1~100)
	}
	
	/**
	 * �ζ� 1~45 ������ �ζ� ��ȣ�� �˷��ִ� �޼ҵ�
	 * 
	 * @return ����� �ζ� ��ȣ
	 */
	public int getNum() {
		Random r = new Random() ;
		return r.nextInt(45) + 1 ; //1~45 ������ �ζ� ��ȣ ����
	}
}

//�����