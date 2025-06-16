package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab073_even_odd {
    public static void main(String[] args) {
        // Create a pgm -take a user input
        // Check odd or even

        //Step 1- input and output
        //input- scanner- int
        //output- odd/even-string

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you input (only integers)");
        int num=sc.nextInt();


        //step 2- rough logic
        //num%2==0-->even
        //num%2!=0-->odd
        //step 3- write logic
        if(num%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }
        sc.close(); // stops taking inputs

        //step 4- edge cases

    }
}
