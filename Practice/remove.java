package Practice;
public class remove {
    public static boolean[] map=new boolean[26];
    public static void removedup(String str , int index,String newstr){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char curchar = str.charAt(index);
        if(map[curchar-'a']==true){
            removedup(str, index+1, newstr);
        }else{
            newstr +=curchar;
            map[curchar-'a']=true;
            removedup(str, index+1, newstr);
        }
    }
    public static void main(String[] args) {
        String str="aabbccdddee";
        removedup(str, 0, "");
    }
}
