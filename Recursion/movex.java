package Recursion;

public class movex {
    public static void moveallx(String str ,int index , int count , String newstr){
       
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char curChar=str.charAt(index);
        if(curChar=='x'){
            count ++;
            moveallx(str, index+1, count, newstr);
        }else{
            newstr += curChar;
            moveallx(str, index+1, count, newstr);
        }
    }

    public static void main(String[] args) {
        String str="axbcxxd";
        moveallx(str, 0, 0, "");
    }
}
