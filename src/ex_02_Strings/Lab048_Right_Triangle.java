package ex_02_Strings;

import java.util.Scanner;

public class Lab048_Right_Triangle {
    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the pattern");
        int n=scanner.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*" +"|");
            }
            System.out.println("");
        }
    }
}
