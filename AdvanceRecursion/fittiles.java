package AdvanceRecursion;

public class fittiles {
    public static int placetile(int n, int m){
        if (n==m)
            return 2;
        if(n<m)
            return 1;

        //vertical
        int vertical = placetile(n-m, m);

        //horizontal
        int horizontal = placetile(n-1, m);

        return vertical + horizontal;

    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placetile(n, m));
    }
}
