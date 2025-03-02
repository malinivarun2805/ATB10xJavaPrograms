package ex14_strings;

public class String_Int_Q {
    public static void main(String[] args) {
        String s1= "Hello"; //String Constant Pool-1
        String s4= "Hello"; //SCP-1

        String s2= new String("Hello"); // Object Area-1
        String s3= new String("hello"); //OA-2
        String s5= new String("HELLO"); //OA-3

        //Comparative operator

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s3==s5);

        //equals function- to check the values

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5)); // ignores the case










    }
}
