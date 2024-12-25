package Recursion;

public class Keypadcombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcombinations(String str,int index,String Combination){
        if(index==str.length()){
            System.out.println(Combination);
            return;
        }
        char curchar=str.charAt(index);
        String mapping=keypad[curchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printcombinations(str, index+1, Combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="23";
        printcombinations(str, 0, "");
    }
}
