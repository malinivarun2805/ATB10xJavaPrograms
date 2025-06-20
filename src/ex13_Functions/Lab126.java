package ex13_Functions;

import java.util.Scanner;

public class Lab126 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of i");
        int i=sc.nextInt();


        System.out.println("enter the value of i1");
        int i1= sc.nextInt();


        int result=sum(i,i1);
        System.out.println(result);
    }

    public static int sum(int i, int i1)
    {
        return i+i1;
    }
}
