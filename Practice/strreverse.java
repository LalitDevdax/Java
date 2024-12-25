package Practice;

public class strreverse {

    public static void revv(String str,int index){
        if(index==0){
            System.out.println(str.charAt(index)+" ");
            return;
        }
        System.out.print(str.charAt(index));
        revv(str, index-1);
    }
    public static void main(String[] args) {
        String str="Lalit Devda";
        revv(str, str.length()-1);
    }
}
