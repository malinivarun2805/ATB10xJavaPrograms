package ex14_strings;

import java.util.Locale;

public class Lab137 {
    public static void main(String[] args) {
        char c = 'A' ;
        System.out.println(c);

        String s="     Malini   ";
        System.out.println(s.length());
        System.out.println(s.concat("Iyer"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());// removes white space

    }
}
