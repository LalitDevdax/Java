
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
        sc.close();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= i; j++) 
					System.out.print("*");
			
			System.out.println();
			
		}

		//for numbers
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= i; j++) 
					System.out.print(i+" ");
			
			System.out.println();
			
		}
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= i; j++) 
					System.out.print(j+" ");
			
			System.out.println();
			
		}
	}
}