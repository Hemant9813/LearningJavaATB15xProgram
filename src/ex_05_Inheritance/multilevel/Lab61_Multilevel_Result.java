package ex_05_Inheritance.multilevel;

public class Lab61_Multilevel_Result {

    static void main(String[] args) {
        Son A=new Son();
        A.car();
        A.home();
        A.Money();
        A.bhk4();

    Father B=new Father();
    B.Money();
    B.car();
    B.home();

    Grandfather C=new Grandfather();
    C.car();
    C.home();

   // Dynamic Dispatch
        Grandfather P1=new Son();
       // System.out.println(P1.);
        Grandfather P4=new Father();
        Father P2=new Son();
//Son P3=new Grandfather();
       // Father P5=new Grandfather();

}}
