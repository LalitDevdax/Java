package classconstructor;

class Student{
    String name;
    int age;

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class parametercons{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Lalit";
        s1.age=18;
        
        s1.printInfo(s1.name,s1.age);    
    }  
}