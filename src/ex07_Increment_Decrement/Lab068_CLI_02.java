package ex07_Increment_Decrement;

public class Lab068_CLI_02 {
    public static void main(String[] args)
    {
        String n1_s=args[0];
        String n2_s=args[1];

        int n1=Integer.parseInt(n1_s);
        int n2=Integer.parseInt(n2_s);

        int result=n1>=n2?n1:n2;
        System.out.println("The larger number is " +result);


    }
}
