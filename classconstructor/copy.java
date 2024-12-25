package classconstructor;
class Pen {
    String Color;
    String Type;

    // Parameterized constructor
    Pen(Pen p2) {
        System.out.println("Parameterized Constructor Called"); 
        this.Color = p2.Color;
        this.Type = p2.Type;
    }

    public void printinfo() {
        System.out.println(this.Color);
        System.out.println(this.Type);
    }

    Pen(){

    }
}

public class copy {
    public static void main(String[] args) {
        // Using parameterized constructor
        Pen p1 = new Pen();
        p1.Color="BLue";
        p1.Type="Gel";
        
        Pen p2=new Pen(p1);
        p2.printinfo();



        
    }
}
