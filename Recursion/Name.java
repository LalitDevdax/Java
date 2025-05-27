package Recursion;

public class Name {

    public static void recursionname(String name, int count) {
        if (count == 5) {
            return;
        }
        System.out.println(name);
        recursionname(name, count + 1);
    }

    public static void main(String[] args) {
        String myname = "HLalit";
        recursionname(myname, 0);
    }
}
