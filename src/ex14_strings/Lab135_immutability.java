package ex14_strings;

public class Lab135_immutability {
    public static void main(String[] args) {
        String s1="Hello";
        s1=s1.concat("World");
        System.out.println(s1);
    }
}
