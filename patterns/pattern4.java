import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row ");
		int row = sc.nextInt();
		
        sc.close();
		for (int i = 0; i<row; i++) {
			for (int j = 1; j <=row-i; j++) {
					System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}