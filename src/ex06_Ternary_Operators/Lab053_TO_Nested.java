package ex06_Ternary_Operators;

public class Lab053_TO_Nested {
    public static void main(String[] args) {

        //Nested Ternary operator
        //result=condition1?exp1:(condition2?exp2:exp3)
       // reduce no. of lines
        /*int num=15;
        String result=(num>10)?((num>20)?"G>20":"between 10 to 20");

        System.out.println(result);



         */

        /*
        Find max num between 2 num
        X>Y
         */

        int x=10;
        int y=20;

        int max=x>y?x:y;
        System.out.println(max);

    }
}
