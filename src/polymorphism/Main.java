package polymorphism;

public class Main {
    static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(5,7));
        circle c = new circle();
        c.draw();
        shape s = new shape();
        s.draw();
    }
}
