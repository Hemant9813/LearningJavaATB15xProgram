package ex_01_Java.Basics;

public class Lab008_Increment_decrement {
    public static void main(String[] args){

        int a=10;
        a = a++ + a++ + a++;
        System.out.println(a);
        // Line no   ||a||   expression
        //6          ||10||  no
        //A->a++   --10
        //B->a++   --11
        //C->a++   --12
        //A+B+C    --10+11+12=33
}}
