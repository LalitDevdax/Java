import java.util.Scanner;
public class rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
        sc.close();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j<=row-i; j++) {
					System.out.print(" ");
            }
			for (int j = 1; j<=row; j++) {
					System.out.print("*");
            }
			System.out.println();
			
		}
    }
}    