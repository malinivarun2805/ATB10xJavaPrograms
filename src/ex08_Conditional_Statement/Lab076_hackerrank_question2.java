package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab076_hackerrank_question2 {
    public static void main(String[] args) {

        //Triangle classifier
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of side1: ");
        double side1= sc.nextDouble();

        System.out.println("Enter the length of side2: ");
        double side2= sc.nextDouble();

        System.out.println("Enter the length of side3: ");
        double side3= sc.nextDouble();

        //Logic
        //if(side1==side2==side3)--> Equilateral
        //if(side1==side2||side2==side3||side3==side1)--> Isosceles
        //if(no sides are equal)--> scalene

        if (side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Invalid input, side length must be positive");
        }else {
            if (side1==side2 && side2==side3 && side3==side1)
            {
                System.out.println("This is an equilateral triangle");
            } else if (side1==side2||side2==side3||side3==side1) {
                System.out.println("This is an isosceles triangle");
            }else {
                System.out.println("This is a scalene triangle");
            }

        }
        sc.close();


    }
}
