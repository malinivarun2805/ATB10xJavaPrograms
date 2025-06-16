package ex07_Increment_Decrement;

import java.util.Scanner;

public class Lab067_CLI_01 {
    public static void main(String[] args)
    {
        String name=args[0];
        //String age_string=args[1];
        //String salary_string=args[2];

        int age=Integer.parseInt(args[1]);
        double salary=Double.parseDouble(args[2]);

        System.out.println("Employee Name " +name);
        System.out.println("Employee Age " +age);
        System.out.println("Employee Salary " +salary);


       /* Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Print the collected information
        System.out.println("\n--- User Information ---");

        System.out.println("Employee Name " +name);
        System.out.println("Employee Age " +age);
        System.out.println("Employee Salary " +salary);

        scanner.close();
        */

    }
}
