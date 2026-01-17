package ex_01_Java.Basics;

public class Lab034_While_factorial {
    public static void main(String[] args){

       int i=1;
        int fact=1;
       while(i<=5){
            fact=fact*i;
            i++;
            //System.out.println(fact);
        }
        System.out.println(fact);
    }
}
