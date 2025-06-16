package ex13_Functions;

public class Lab120_UD_functions {
    public static void main(String[] args) {

       // Step 2- calling of functions in the main program
        main();
        greet();
        System.out.println("k"); // no return type
        System.out.print("l"); // no return type
        System.out.printf("m"); // no return type

    }

    //step 1- definition / declaration
    // no parameter ----main ( empty)
    // no return type ---- void
    static void main()
    {
        System.out.println("Look alike of Main");
    }
    static void greet()
    {
        System.out.println("Hi, how are you?");
    }
}
