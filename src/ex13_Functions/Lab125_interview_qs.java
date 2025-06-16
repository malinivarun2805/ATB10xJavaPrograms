package ex13_Functions;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab125_interview_qs {
    public static void main(String[] args) {
        // create a function of sub, mul,add, div, mod
        // with parameter a, b (take user parameter)

        // Logic Building

        // Step 1: inputs and outputs
        // from scanner--> int--> a,b

        // Step 2: make functions

        // Step 3: write code, find and fix

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        // if anyone enters anything apart from integer, then handle it as below
        int a=0;

        if(sc.hasNextInt())
        {
            a= sc.nextInt();;
        }
        else
        {
            System.out.println("enter only integer");
            System.exit(0);
        }
        // to fix one of the edge cases (find in chatGPT or Claude.ai)
        // i.e. larger number to be used as input

        //BigInteger a=sc.nextBigInteger();

        System.out.println(" Enter the value of b: ");
        int b=sc.nextInt();

        int result1=sum(a,b);
        System.out.println(result1);
        int result2=sub(a,b);
        System.out.println(result2);
        int result3=mul(a,b);
        System.out.println(result3);
        int result4=div(a,b);
        System.out.println(result4);
        int result5=mod(a,b);
        System.out.println(result5);



    }
    static int sum(int a, int b){
        return a+b;

    }
    static int sub(int a, int b)
    {
        return a-b;

    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Division by zero not allowed!");
        }
        return a/b;
    }
    static int mod(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Division by zero not allowed!");
        }
        return a%b;
    }
}
