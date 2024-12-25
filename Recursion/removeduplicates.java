package Recursion;

public class removeduplicates {
    public static boolean[] map=new boolean[26] ;

    public static void removedup(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char curChar=str.charAt(index);
        if(map[curChar -'a'] == true){
            removedup(str, index+1, newstr);

        }else{
            newstr +=curChar;
            map[curChar-'a']=true;
            removedup(str, index+1, newstr);
        }
    }

    public static void main(String[] args) {
        String str="abbccda";
        removedup(str, 0, "");
    }
}
