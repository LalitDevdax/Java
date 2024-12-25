package OOPS.Inheritence;
// import bank.*;

class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void area(int b , int h){
        System.out.println("Area of triangle : "+1/2 * b*h);
    }
}
class Rectangle extends Shape{
    public void area(int l,int b){
        System.out.println("Area of rectangle : "+l*b);
    }
}



public class heirarchial {
    public static void main(String[] args) {
        // bank.Account acc1 = new bank.Account();
        // acc1.name="Customer1";
    }
}
