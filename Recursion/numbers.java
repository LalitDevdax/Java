package Recursion;

public class numbers {

    public static void printnumbers(int n) {
        /*if(n==0){
            return;
        }
        System.out.println(n);
        printnumbers(n-1); */
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumbers(n+1); 
    }
    public static void main(String[] args) {
        printnumbers(1);
    }
}
