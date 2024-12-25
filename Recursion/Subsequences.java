package Recursion;

public class Subsequences {
    public static void subsequences(String str,int index,String newstr){

        //base case
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }

        char curChar=str.charAt(index);
        //if want to be :
        subsequences(str, index+1, newstr+curChar);

        //dont want to be
        subsequences(str, index+1, newstr);
    }

    public static void main(String[] args) {
        String str="abc";
        subsequences(str, 0, "");
    }
}
