package ex04_operators;

public class Lab037_concatenate_operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);

        String N1="Kate";
        String N2="Nate";
        System.out.println(N1+N2);

        //important
        System.out.println(N1+N2+a+b);
        //KateNate1020-answer

        System.out.println(a+b+N1+N2);
        //answer-30KateNate

        System.out.println(N1+N2+(a+b));
        //KateNate30

        System.out.println();
    }
}
