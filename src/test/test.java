package test;

import java.util.Scanner;

public class test {
    static void main(String[] args) {
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.print("enter a no: ");
            int a = s.nextInt();
            System.out.print("enter 2nd no: ");
            int b = s.nextInt();
            if(a>b){
                System.out.println(a + " is greater then " + b);
            }
            else if (b>a){
                System.out.println(b + " is greater then " + a);
            }
            else{
                System.out.println(b + " is equal to " + a);
                break;
            }
        }


    }
}
