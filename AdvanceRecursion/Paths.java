package AdvanceRecursion;

public class Paths {
    public static int countpaths(int i,int j,int n,int m){

        //base case
        if(i==n || j==m){
            return 0;
        }
        if (i==n-1 || j==m-1) {
            return 1;
        }

        //for downward
        int downward=countpaths(i+1, j, n, m);
        //for rightward
        int rightward=countpaths(i, j+1, n, m);
        return downward+rightward;

    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(countpaths(0, 0, n, m));
    }
}
