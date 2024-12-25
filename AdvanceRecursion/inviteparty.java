package AdvanceRecursion;

public class inviteparty {

    public static int callperson(int n){
        if(n <= 1){
            return 1;
        }
        //single person
        int single=callperson(n-1);
        //couple person
        int couple = (n-1) * callperson(n-2);
        return single+couple;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callperson(n));
    }
}
