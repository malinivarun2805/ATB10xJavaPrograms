package ex05_TypeCasting;

public class Lab048_Typecasting_P1 {

    public static void main(String[] args) {
        //Widening
        byte b=10;
        int a=b;
        System.out.println(a);// implicit casting-compiler is doing it

        byte b1=1;
        int a1=(int)b1;//explicit casting-
        System.out.println(a1);



    }
}
