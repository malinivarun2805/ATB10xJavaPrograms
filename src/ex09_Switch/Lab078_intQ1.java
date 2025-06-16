package ex09_Switch;

import java.util.Scanner;

public class Lab078_intQ1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next();

        switch(browser){
            case "chrome":
                System.out.println("Starting the Chrome browser");
                System.out.println("..........");
                System.out.println("Chrome here");
                break;

            case "firefox":
                System.out.println("starting the Firefox browser");
                break;

            case "edge":
                System.out.println("Execute the Edge code");
                break;

            default:
                System.out.println("unknown browser");
                break;
        }
    }
}
