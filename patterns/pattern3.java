import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row ");
		int row = sc.nextInt();
		
        sc.close();
		for (int i = row; i >0; i--) {
			for (int j = 1; j <= i; j++) 
					System.out.print("*");
			
			System.out.println();
			
		}
	}
}