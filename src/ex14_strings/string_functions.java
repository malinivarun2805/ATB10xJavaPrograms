package ex14_strings;

public class string_functions {
    public static void main(String[] args) {
        String anotherPalindrome= "Niagara. O roar again!";
        String roar=anotherPalindrome.substring(11,15);//indexation starts with 0,1,2,...
        System.out.println(roar);


        String s1="Malini";
        String s2 =s1.concat("Iyer");
        System.out.println(s2);
    }
}
