package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab074_if_elseif {
    public static void main(String[] args) {

        //when n1>n2
        //when n2>n1
        //when n1==n2

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        if(n1>n2){
            System.out.println("n1");
        } else if (n2>n1) {
            System.out.println("n2");
        }
        else{
            System.out.println("equal");
        }


    }
}
