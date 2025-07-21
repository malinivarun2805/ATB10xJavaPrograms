package ex15_String_Functions;

public class Lab143_string_functions {
    public static void main(String[] args) {
        String name="abcdefghijklmnopqrstuvwxyz";
        String name1="monal";
        //length
        System.out.println(name.length());

        //charAt
        System.out.println(name.charAt(1));

        //concat
        System.out.println(name.concat("123"));

        //contains
        System.out.println(name1.contains("on"));

        //equals
        System.out.println(name1.equals("sonal"));

        //equalsIgnorecase
        System.out.println(name1.equalsIgnoreCase("MONAL"));

        //indexOf
        System.out.println(name.indexOf('m'));

        //replace
        System.out.println(name.replace('n','N'));

        //split
        String name2="abc@cde@def.com@123";
        String[] split=name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(split[3]);

        //substring
        System.out.println(name.substring(1,9));
        String ss="Hamburger";
        System.out.println(ss.substring(4,8));

        //lowercase
        System.out.println("SONAL".toLowerCase());

        //uppercase
        System.out.println("shree".toUpperCase());

        //startsWith- checks if the String starts with the same letter or not
        System.out.println(name1.startsWith("M"));

        //endsWith
        System.out.println(name1.endsWith("l"));

        //trim- leading and trailing spaces are removed-aage and peeche se
        String name3="        Harish Kalyan       ";
        System.out.println(name3.trim());

        //compareTo
        String ss1="education";
        System.out.println(ss1.compareTo("educative"));


        //Returns:
        //the value 0 if the argument string is equal to this string;
        // a value less than 0 if this string is lexicographically less than the string argument;
        // and a value greater than 0 if this string is lexicographically greater than the string argument.

        //compareToIgnoreCase
        String ss2="Educative";
        System.out.println(ss2.compareToIgnoreCase("EdUcAtIvE"));


        //StringBuilder
        //append
        StringBuilder stringBuilder=new StringBuilder("Monal");
        stringBuilder.append("Singh");
        System.out.println(stringBuilder);


    }
}
