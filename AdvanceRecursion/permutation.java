package AdvanceRecursion;
public class permutation {

    public static void combi(String str,String permutations){
        if(str.length()==0){
            System.out.println(permutations);
        }
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newstr =str.substring(0,i) + str.substring(i+1);
            combi(newstr, permutations+curchar);
        }
        
    }

    public static void main(String[] args) {
        String str="abcd";
        combi(str, "");
    }
}