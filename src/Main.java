public class Main {
    public static void main() {
        student A = new student("Saurabh", 47, 23, 7, 'Tina');
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
//        System.out.println(A.gf);

        A.study();
        A.bunk();
        A.sleep();
//        A.gfChatting();

        student B = new student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);
    }
}