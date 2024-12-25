package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibRecursion(int count) {
      if (count == 0) {
        return 0;
      } // Oth fibonacci is 0
  
      if (count == 1 || count == 2) {
        return 1;
      } // 1st and 2nd Fibonacci are 1 and 1 only
  
      // calling function recursively for nth Fibonacci
      return fibRecursion(count - 1) + fibRecursion(count - 2);
    }
  
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Fibo Range : ");
        int fib_len =sc.nextInt();
        sc.close();
  
        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
  
        for (int i = 0; i < fib_len; i++) {
          System.out.print(fibRecursion(i) + " ");
        }
    }
  }
  