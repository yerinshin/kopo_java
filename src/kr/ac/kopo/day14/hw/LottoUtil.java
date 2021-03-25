package kr.ac.kopo.day14.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoUtil {
	
	public Integer getLottoNum() {
		Random r = new Random();
		int num = r.nextInt(45 -2) +2;
		
		return num;
	}
	
	
	
	//배열 사용
	public void getLotto01() {
		int[] lottoArr = new int[7];
			for(int i =1; i <= lottoArr.length; i++) {
				lottoArr[i-1] = getLottoNum();
			}
			System.out.print(Arrays.toString(lottoArr));
			System.out.println();

	}
	
	
	public void getLotto02() {
		System.out.print("[");
		for(int i=1; i<=6; i ++) {
		System.out.print(getLottoNum() + ", ");
		}
		
		System.out.println(getLottoNum() + "]");
	}
	
	//List
	public void getLotto03() {
		List<Integer> lottoList = new ArrayList<>();
		for(int i = 1; i <= 7; i ++) {
			lottoList.add(getLottoNum());
		}
		Object[] arr = lottoList.toArray(); 	
		System.out.println(Arrays.toString(arr));
	}
	
	//Set
	public void getLotto04() {
		Set<Integer> lottoSet = new HashSet<>();
		for(int i = 1; i <= 7; i ++) {
		lottoSet.add(getLottoNum());
		}
		Object[] arr = lottoSet.toArray();
		System.out.println(Arrays.toString(arr));
		
	}
}
