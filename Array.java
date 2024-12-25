import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the total subjects you want to store marks of :  ");
        size = sc.nextInt();
        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " Subject Marks : ");
            marks[i] = sc.nextInt();
        }

        System.out.println("The List Of Marks Is Given Below : ");
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int max = marks[0];
        int min = marks[0];
        for (int i = 0; i < size; i++) {
            if (marks[i] > max) {
                max = marks[i];
            } else if (marks[i] < min) {
                min = marks[i];
            }

        }
        System.out.println("Max Element of array is : " + max);
        System.out.println("Min Element of array is : " + min);
        System.out.println("----------------------------");
        System.out.print("Enter the marks you want to search : ");
        int search = sc.nextInt();
        sc.close();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == search) {
                System.out.print("The marks " + search + " found at index " + i + " !!");
                break;
            } else {
                System.out.print("The marks " + search + " found at index " + i + " !!");
            }
        }
    }
}
