package kr.ac.kopo.day09.hw;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String str = new String();
		StringUtil util = new StringUtil();
		
		util.isUpperChar('C');
		util.isLowerChar('c');
		util.max(2, 5);
		util.min(17, 2);
		util.reverseString("Hello World");
		util.toUpperString("hEllO worlD");
		util.toLoserString("hEllO worlD");
	}

}
