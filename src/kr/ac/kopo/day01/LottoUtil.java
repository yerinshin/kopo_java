//선언부(주석문, 패키지, 임포트, 클래스 선언)
package kr.ac.kopo.day01;

import java.util.Random;

/**
 * (문서화 주석)
 * 로또와 관련된 기능을 제공하는 기능 클래스
 * 
 * @author 조세진
 *
 */

//참조 클래스
public class LottoUtil {
	// 내용부(멤버변수, 메소드 내부클래스)
	
	//멤버변수
	int lottoNum ;
	
	//메소드
	/**
	 * 오늘의 로또 확률을 출력해주는 메소드
	 */
	public void todayLotto() {
		Random r = new Random() ;
		System.out.println("오늘의 로또 확률: "+r.nextInt(101) + "%입니다.") ;
									//101로 나누었을 때 나올 수 있는 나머지 값(1~100)
	}
	
	/**
	 * 로또 1~45 사이의 로또 번호를 알려주는 메소드
	 * 
	 * @return 추출된 로또 번호
	 */
	public int getNum() {
		Random r = new Random() ;
		return r.nextInt(45) + 1 ; //1~45 사이의 로또 번호 추출
	}
}

//선언부