package OOPS;

abstract class Animals{
    abstract void walk();//we can directly give semicolon instead of curly braces ; 
    Animals(){
        System.out.println("Created cnstructor inside class ");//creating constrctor inside class of same 
    }

    public void eats(){
       System.out.println("Animals eat"); //abstraction case but not hidden so its abstract 
        

    }
}

class Horse extends Animals{
    Horse(){
        System.out.println("Created cnstructor inside class Horse");//creating constructor
    }
    public void walk(){
        System.out.println("Walks On 4 Legs");
    }
}
class Chicken extends Animals{
    public void walk(){
        System.out.println("Walks On 2 Legs");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Horse horse1=new Horse();
        horse1.walk();
        // Animals anmal =new Animals();//will givee error like  Cannot instantiate the type Animals because of abstraction
        // anmal.walk();

    }
}
