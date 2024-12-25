package Practice;

public class Subsequence {
    public static void subsequence(String str,int index,String newstr){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        //if want to 
        char curchar=str.charAt(index);
        subsequence(str, index+1, newstr+curchar);

        //if don't wanna
        subsequence(str, index+1, newstr);

    }

    public static void main(String[] args) {
        String str="abc";
        subsequence(str, 0, "");
    }
}
