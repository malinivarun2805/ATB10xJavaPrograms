package ex16_Array;

import java.util.Scanner;

public class user_input_8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();

        int[] num=new int[size];

        for(int i=0;i<num.length;i++)
        {
            System.out.println("ENter the number");
            num[i]=sc.nextInt();

        }
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }



    }
}
