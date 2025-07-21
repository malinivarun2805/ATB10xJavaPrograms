package ex10_For_Loops;

public class Lab106_HW {
    public static void main(String[] args) {

        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        //(while loop, if else)

        int a=1;
        while (a<=100){
            if(a%3==0 && a%5==0){
                System.out.println("FizzBuzz");
            }else if(a%3==0){
                System.out.println("Fizz");
            }else if(a%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(a);
            }
            a++;
        }

    }
}
