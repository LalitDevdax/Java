package OOPS.Inheritence;

class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void area(int l , int b){
        System.out.println(1/2 * l * b);
    }
}

public class singlelevel {
    public static void main(String[] args) {
        Triangle t1=new Triangle ();
        t1.area(10,20);
        
    }
}