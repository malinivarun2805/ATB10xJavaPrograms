package ex06_Ternary_Operators;

public class Lab054_grade_calculator {
    public static void main(String[] args) {
        /*A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59


            int grade=89;
         result=grade>=90?(A:((grade>=80)?B):((grade>=70)?C):((grade>=60)?D):F)
         */

        int grade=109;
        String result;
        result=((grade>=90 && grade<=100?"A":((grade>=80 && grade<=100)?"B":((grade>=70 && grade<=100))?"C":((grade>=60 && grade<=100)?"D":(grade>=0 && grade<=59)?"F":"incorrect entry"))));

        System.out.println("Your grade is " +result);



    }
}
