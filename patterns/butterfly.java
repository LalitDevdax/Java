import java.util.Scanner;

public class butterfly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();

		sc.close();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (row - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (row - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}