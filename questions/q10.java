package questions;
import java.util.Scanner;

public class q10 {

    public static void vote(int x) {
			if (x >= 18) {
				System.out.println("Person is allowed to vote :) ");
			} else {
				System.out.println("Person is not allowed to vote :( ");
			}
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your age : ");
			int x = scanner.nextInt();
            scanner.close();
            vote(x);
		}
	}
