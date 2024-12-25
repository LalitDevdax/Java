package Strings;

public class stringfunctions {
    public static void main(String[] args) {
        //concatenation
        String firstname="Tony";
        String lastname="Stark";
        String Fullname=firstname +" "+lastname;
        System.out.println("Your Name : "+Fullname);
        String sne="My name is Tony Stark";
        String newsne=sne.substring(11,21);
        System.out.println("Name after slice is "+newsne);

        //.compareTo

        if(firstname.compareTo(lastname) ==0){
            System.out.println("Strings are Equal !!");
        }
        else{
            System.out.println("Strings are not equal !!");
        }

        //length

        System.out.println("Length of Fullname is : "+Fullname.length());

        //charAt

        for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i)+" ");
        }

        //int to string 
        int i=123;
        String s=Integer.toString(i);
        System.out.println(s);

        //string to int

        String s1="123";
        int i2=Integer.parseInt(s1);
        System.out.println(i2);
    }
    
}