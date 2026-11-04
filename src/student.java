// creating a student class

public class student {

    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;


    //constructor
    public student(String name, int id, int age, int nos, String gf){
        this.name = name;
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
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
    private void gfChatting(){
        System.out.println(name + "gf chatting");
    }
}
