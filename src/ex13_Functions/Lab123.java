package ex13_Functions;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        //### **User Defined Functions.**
        //1. Without Parameters and Without Return Type.
        greet();


        //2. Without Parameters but With Return Type
        String s = greet_with_hello();
        System.out.println(s);


        int i =age_to_vote();
        System.out.println(i);


        //3. With Parameters and Without Return Type




       /* greet_with_name("Barbie");
        greet_with_name("Kane");
        greet_with_fullName("Malini", "Iyer");*/


        Scanner sc=new Scanner(System.in);
        System.out.println("enter you name");
        String name=sc.next();
        System.out.println("enter you age");
        int age= sc.nextInt();
        System.out.println("enter you salary");
        double salary = sc.nextDouble();

        greet_with_details(name,age,salary);


        //4. With Parameters and With Return Type
        int sum =sum_of_two_numbers(5,6);
        System.out.println(sum);
        int sum2=sum_of_two_numbers(90,900);
        System.out.println(sum2);


    }




    //1. Without Parameters and Without Return Type.
    static void greet()
    {
        System.out.println("Hi");
    }





    //2. Without Parameters but With Return Type
    static String greet_with_hello()
    {
        System.out.println("Hello");
        return "Hello1" ;
    }

    static int age_to_vote()
    {
        System.out.println("calculating age...");
        return 18;

    }



    //3. With Parameters and Without Return Type
    static void greet_with_name(String name)
    {
        System.out.println("HI, your name is " +name);
    }

    static void greet_with_fullName(String firstName, String lastName)
    {
        System.out.println("Hi, My name is " +firstName +" " +lastName);
    }


    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("your name is -->" +name + "\nyour age is -->" +age + "\nyour salary is -->" +salary);
    }



    //4. With Parameters and With Return Type

    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;

    }

    //static String


}
