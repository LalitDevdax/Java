// if we hide all useless info like walk eat so it'll be interfaces because interfaces uses pure abstraction as it'll hide all unnecessary info.

package OOPS;

interface Animals {
    int eyes = 2;// will be same for all derived class no change theyare permanent

    void walk();// we can directly give semicolon instead of curly braces ;
}

interface Herbivore {
    // showing multiple inheritance : single derived class from multiple parent
    // classes!!
}

class Horse implements Animals, Herbivore {
    public void walk() {
        System.out.println("Walks On 4 Legs");
    }
}

public class Abstractioninterface {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
        // Animals anmal =new Animals();//will givee error like Cannot instantiate the
        // type Animals because of abstraction
        // anmal.walk();

    }
}
