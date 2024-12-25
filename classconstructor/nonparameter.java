package classconstructor;

class Pen{
    String Color ;
    String Type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printinfo(){
        System.out.println(this.Color);
        System.out.println(this.Type);
    }


}
public class nonparameter {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.Color="Blue";
        p1.Type="Gel";
        p1.printinfo();
    }
}
