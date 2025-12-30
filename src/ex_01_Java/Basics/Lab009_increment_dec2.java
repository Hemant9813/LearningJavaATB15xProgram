package ex_01_Java.Basics;

public class Lab009_increment_dec2 {
    static void main(String[] args) {
        int a = 3;

        int b = a++ * ++a;

        System.out.println(b);
        //A-> a++   3
        //B-> ++a   5
        //b=A*B    15
    }
}
