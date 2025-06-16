package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab075_hackerrank_question1 {
    public static void main(String[] args) {
        //Grade calculator
        /*A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59

        int grade=89;

        if(score>=90 && score<=100)-->A
        elseif(score<=89 && score>=80)-->B
        elseif(score<=79 && score>=70)-->C
        D
        else--> F
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score");
        int score= sc.nextInt();
        char grade='P'; //default value of a local variable

        if (score>=90 && score<=100)
        {
            //System.out.println("Score is A");
            grade='A';

        }
        else if (score>=80 && score<=89)
        {
            //System.out.println("Score is B");
            grade='B';
        } else if (score>=70 && score<=79) {
            //System.out.println("Score is C");
            grade='C';
        } else if (score>=60 && score<=69) {
           // System.out.println("Score is D");
            grade='D';
        } else if (score<=0 || score>100) {
            grade='0';
            System.out.println("Whoa! not possible");

        } else
        {
            //System.out.println("Score is F");
            grade='F';
        }
        System.out.println("Your Grade is " +grade);

        //edge case
        /*
        if(score<=0 && score>100)
         */
    }
}
