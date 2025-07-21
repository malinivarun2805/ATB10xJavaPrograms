package ex13_Functions;

public class Lab129_HW2 {

    public static void main(String[] args) {

        //Reverse string
        String name="RACEcar";

        String rev=reverseUsingCharAt(name);
        System.out.println(rev);
        if(name.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }


    }

    private static String reverseUsingCharAt(String name) {
        String rev="";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev=rev+name.charAt(i);
        }
        return rev;
    }
}
