package kr.ac.kopo.day05.hw;

import java.util.Scanner;

public class HomeWork03 {

		public static void main(String[] args) {
			
			int[] arr = new int[99];
			int[] arr2 = new int[99]; 
					
			for(int i =0; i< arr.length; i++) {
				arr[i] = i+2;
				
				for(int j = 2; j < arr[i]; j++) {
					if(arr[i] % j ==0) {
						arr[i] =0;
					}else {
						arr2[i] = i;
						break;
					}
				}
				System.out.print(i + " ");
				
			}
				
			
			
		}
	}


