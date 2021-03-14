package kr.ac.kopo.day04.hw;

public class HomeWork03 {

	public static void main(String[] args) {

		int height = 0;
		int hour = 0;

		while (height <=100) {
			
			hour += 1;
			height += 5;
			
			if (height < 50) {
				height -= 1;
			} else{
				height -= 2;
			}
			System.out.println("[" + hour + "시간 후] 달팽이가 올라간 총 높이 : " + height + "M" );
		}

	}
}
