package ex_01_Java.Basics;

public class Lab012_Typecasting_narrowing {
    static void main(String[] args) {
        long a=10;
        short b=(short)a;
        System.out.println(b);// Narrowing casting using explicit

        double c=1234323.3333333;
        int d=(int)c;
        System.out.println(c);

    }
}
