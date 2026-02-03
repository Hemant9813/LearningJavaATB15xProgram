package ex_03_Opps;

public class Lab52_Opps {
    static void main(String[] args) {

        Lab51_Person p1 =new Lab51_Person();


        //Lab51 is class, P1 is object reference and new Lab51_Person() is object in heap area

        Lab51_Person p2;
        // p2 is referencing to null area in heap area because it doesn't have any object

        new Lab51_Person();
        // Here object is created in heap area but don't have any reference so it will not call
    }
}
