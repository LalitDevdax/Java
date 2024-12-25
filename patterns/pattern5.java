
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
        sc.close();
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <row-i; j++) {
                System.out.print(j+" ");
            }
			
			System.out.println();
			
		}
	}
}