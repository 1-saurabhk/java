// creating a student class

public class student {

    public int id;
    public int age;
    public String name;
    public int nos;

    //constructor
    public student(String name, int id, int age, int nos){
        this.name = name;
        this.id = id;
        this.age = age;
        this.nos = nos;
    }

    public student(student srcobj){
        this.name = srcobj.name;
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
    }

    //behaviour /methods

    public void study(){
        System.out.println(name + " studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }
}
