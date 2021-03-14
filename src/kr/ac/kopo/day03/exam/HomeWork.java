package kr.ac.kopo.day03.exam;

public class HomeWork {
	public static void main(String[] args) {

		// 6번
		System.out.println("6>");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 9; j >= 2 * i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 7번
		System.out.println("7>");
		// [방법 1]

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= i - 5; j++) {
					System.out.print(" ");
				}
				for (int j = 18; j >= 2 * i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();

		// [방법 2]

		int space;

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				space = 5 - i;
			} else {
				space = i - 5;
			}

			for (int j = 1; j <= 9; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else if (j <= 9 - space) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		System.out.println();
		// [방법 3]
		int n = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5 - n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * n - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < 5) {
				n++;
			} else {
				n--;
			}
		}

		// 8번
		System.out.println("8>");

		// [방법1]
		int dot = 0;
		int bar = 9;

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				dot++;
				bar -= 2;
			} else {
				dot--;
				bar += 2;
			}
			for (int j = 1; j <= 9; j++) {
				if (j <= dot) {
					System.out.print("*");
				} else if (j <= dot + bar) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		System.out.println();

		// [방법2]
		
		int star = 0;

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				star++;
			} else {
				star--;
			}

			for (int j = 1; j <= 9; j++) {
				if (j <= star || j > 9 - star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}