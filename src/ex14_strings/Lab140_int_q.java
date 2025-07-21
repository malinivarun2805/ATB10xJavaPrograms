package ex14_strings;

public class Lab140_int_q {
    public static void main(String[] args) {
        //== comparison

        String s1="Hello"; // SCP
        String s4="Hello";
        String s10="Hello"; // SCP=1

        String s2=new String("Hello"); // created and stored in OA
        String s3=new String("Hello");
        String s5=new String("hello"); // OA=3

        // But in case of String, == checks the location

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s10);
        System.out.println(s3==s5);

        // equals(content)-->value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));



    }
}
