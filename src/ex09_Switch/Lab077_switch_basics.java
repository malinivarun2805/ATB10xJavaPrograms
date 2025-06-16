package ex09_Switch;

import java.util.Scanner;

public class Lab077_switch_basics {
    public static void main(String[] args) {

        //user enter int number 1-7
        //which day it is
        //1-->monday, 4-->thursday, etc.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number from 1-7: ");
        int dnum= sc.nextInt();

        switch (dnum)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea what day it is");
                break;
        }

    }
}
