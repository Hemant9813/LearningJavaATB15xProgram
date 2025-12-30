package ex_01_Java.Basics;

public class Lab011_Typecasting {
    static void main(String[] args) {

    byte a=10;
    short b=(short)a;// Widening using Explicit method
        /* Widening using Implicit method */

        System.out.println(b);
        int c = b;
        System.out.println(c);

    }
}
