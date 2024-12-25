package BitManipulation;

public class bitget {
    public static void main(String[] args) {
        int n=3;
        int pos=2;
        int bitmask=1<<pos;
        if ((bitmask & n )==0) {
            System.out.println("The Bit Was Zero !!");
        }else{
            System.out.println("The Bit Was One !!");
        }
    }
}
