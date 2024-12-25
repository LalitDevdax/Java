package Recursion;

public class occurence {
    public static int first =-1;
    public static int last =-1;
    //making first and last as static so they do not change everytime in recurssion
    public static void findoccurence(String str,int index,char element) {
        if(index==str.length()){
            System.out.println("First Occurance : "+first);
            System.out.println("Last Occurance : "+last);
            return;
        }
        char curChar=str.charAt(index);
        if(curChar==element){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        findoccurence(str, index+1, element);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findoccurence(str, 0, 'a');
    }
}
