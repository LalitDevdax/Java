package Stackk;

import java.util.Stack;

public class stackwithframework {

    public static void pushbottom(int data, Stack<Integer> s) { // int data=which data to pushh
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int toop = s.pop();
        reverse(s);
        pushbottom(toop, s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushbottom(4, s);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
