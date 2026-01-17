package ex_01_Java.Basics;

public class Lab20_Concatenate {
    public static void main (String[] args){

        int a=20;
        int b=30;

        String manual ="hemant";
        String testing ="singh";

        //The whole line will get concatenate bcz concat comes first bcz jvm goes left to right
        System.out.println(manual+" "+testing+" "+a+" "+b);
        //First it will do the arithmetic as first there is integer value and then it will do concatenate
        System.out.println(a+b+" "+manual+testing);
        //First jvm follow BODMAS rule it will search for bracket first
        System.out.println(manual+testing+" "+(a+b));
    }
}
