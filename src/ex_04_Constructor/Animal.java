package ex_04_Constructor;

import java.sql.SQLOutput;

public class Animal {

    public static void main(String[] args){
        Lab53_Con_Ani dog =new Lab53_Con_Ani();
        System.out.println("Default constructor of Animal");
        A a=new A();
        B b=new B();
    }
}

class A{
    A(){
        System.out.println("A constructor");
    }
}

class B{
    B(){

        System.out.println("B constructor");
    }
}