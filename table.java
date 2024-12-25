import java.util.Scanner;
public class table {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i,n,mul;
      System.out.println("Enter a no. for table : ");
      n=sc.nextInt();
      sc.close();
      System.out.println("The Multiplication Table of "+n+" is : ");
      for(i=1;i<=10;i++){
        mul=n*i;
        System.out.println(n+" * "+i+" = "+mul);
      }  
    }
}
