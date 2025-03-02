package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab069_if_condition_scanner
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age!(as integer)");
        int age =sc.nextInt();

        if(age>18)
        {
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("No voting allowed");
        }

    }
}
