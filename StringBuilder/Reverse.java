package StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        
        StringBuilder sb = new  StringBuilder("Tony");
        System.out.println("Given String is : "+sb);
        StringBuilder sb1 = new StringBuilder("");
        
        for(int i = sb.length()-1; i>=0; i--){
            sb1.append(sb.charAt(i));
        }
        System.out.println("Reversed String is : "+sb1);;

    }
}
