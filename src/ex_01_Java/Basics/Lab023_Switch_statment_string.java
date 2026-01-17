package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab023_Switch_statment_string {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser= scanner.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Print TC1");
                System.out.println("Print TC2");
                break;
            case "edge":
                System.out.println("Edge print");
            default:
                System.out.println("Enter correct data");
        }
    }
}
