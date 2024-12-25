package Recursion;

import java.util.Scanner;

public class stringrev {
    public static void strrev(String str,int index) {
        if(index==0){
            System.out.print(str.charAt(index)+ " ");
            return ;
        }

        System.out.print(str.charAt(index));
        strrev(str,index-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        sc.close();
        strrev(str,str.length()-1);
    }
}
