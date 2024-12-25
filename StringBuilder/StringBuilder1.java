package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony Stark");
        System.out.println(sb);

        //charAt

        System.out.println(sb.charAt(0));

        //new function : set char at it'll take 2 parameter first index and second which char to set 

       // System.out.println(sb.setCharAt(0, 'P')); we need to remove print statement because itll change the statement first so 
       sb.setCharAt(0, 'P');
       System.out.println(sb);

       //new function : insert , it'll take 2 parameter first index and second which char to insert
       sb.insert(0, 'S');
       System.out.println(sb);

       //new function : delete , it'll take 2 parameter first index and second index
       sb.delete(0, 1);
       System.out.println(sb);

       //append - means add element to last 

       sb.append('H');
       System.out.println(sb);
    }
}
