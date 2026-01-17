package ex_02_Strings;

import java.util.Scanner;

public class Lab038_Reverse_String {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the String");
        String user_input=scanner.next();
        String reverse="";

        for (int i=user_input.length()-1;i>=0;i-- ){
            reverse=reverse + user_input.charAt(i);
        }
        System.out.println(reverse);
    }
}
