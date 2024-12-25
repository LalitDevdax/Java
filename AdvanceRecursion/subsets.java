package AdvanceRecursion;

import java.util.ArrayList;

public class subsets {

    public static void finalsubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printsub(int n,ArrayList<Integer> subset){

        if(n==0){
            finalsubset(subset);
            return;
        }
        // add hona h
        subset.add(n);
        printsub(n-1, subset);

        //add nhi hona
        subset.remove(subset.size()-1);
        printsub(n-1, subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        printsub(n, subset);
    }
}
