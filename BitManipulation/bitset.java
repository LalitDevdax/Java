package BitManipulation;

public class bitset {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        int newnumber = bitmask | n;
        System.out.println(newnumber);
    }
}