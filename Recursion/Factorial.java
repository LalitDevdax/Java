package Recursion;

import java.util.Scanner;

class Factorial {

    static int factorial(int n) {
      // base case
      if (n == 0) {
        return 1;
      }
      // calling recursive function
      return n * factorial(n - 1);
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number you want factorial of : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Factorial of the given number is: " + factorial(n));
    }
  }
  
