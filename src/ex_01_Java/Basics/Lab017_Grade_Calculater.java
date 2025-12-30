package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab017_Grade_Calculater {
   // Write a program that calculates and displays the letter grade for a given numerical score
    // (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    // B: 80-89
    // C: 70-79
    // D: 60-69
    // F: 0-59
   static void main(String[] args) {
       System.out.println("Put the user input");
       Scanner scanner =new Scanner(System.in);
       int score = scanner.nextInt();
       if (score >=90 && score<=100){
           System.out.println("A");
       } else if (score>=80 && score<=89){
           System.out.println("B");
       }else if (score>=70 && score<=79) {
           System.out.println("C");
       }else if (score>=60 && score<=69) {
           System.out.println("D");
       }else {
           System.out.println("F");
           {

       }

       }}}


