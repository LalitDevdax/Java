package Recursion;
import java.util.HashSet;
public class UniqueSubsequences {
    public static void subsequences(String str,int index,String newstr,HashSet<String> set){

        //base case
        if(index==str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char curChar=str.charAt(index);
        //if want to be :
        subsequences(str, index+1, newstr+curChar,set);

        //dont want to be
        subsequences(str, index+1, newstr,set);
    }

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>(); 
        String str="aaa";
        subsequences(str, 0, "",set);
    }
}

