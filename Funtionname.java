import java.util.Scanner;

public class Funtionname {

    public static void printname(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("\nEnter your Name : ");
        String name = p.nextLine();
        printname(name);
        p.close();

    }
}
