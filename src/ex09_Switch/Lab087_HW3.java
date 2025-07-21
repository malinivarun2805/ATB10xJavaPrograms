package ex09_Switch;

public class Lab087_HW3 {
    public static void main(String[] args) {

        //✅ Palindrome of String (chatAt()) -
        // Naman, → reverse - Naman ,
        // madam ( string = rev(str)

        String str = "Madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        System.out.println(rev);

        System.out.println(str);


    }



}