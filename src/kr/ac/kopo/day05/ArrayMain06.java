package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30};
		int[] b = {5, 7, 8, 9, 20, 23};
		
		// c = [10, 20, 30, 5, 7, 8, 9, 20, 23] 만들기
		
		
		
		
		int[] c = new int[a.length + b.length];
		int loc =0;
		for(int i =0; i< a.length; i++) {
			c[loc++] = a[i];
		}
		for(int i=0; i < b.length; i++) {
			c[loc++] = b[i];
		}
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
	
			
	
	}

}
