package ex03_Literals;

public class Lab030_Literals_Char {
    public static void main(String[] args) {
        char c1='A';
        char c2='B';
        char c3='@';
        char c4='_';
        char c5=' ';
        char c6='1';
        char c7='(';
        char c8='0';

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

       System.out.println("Malini" + new_line +"Iyer");
        System.out.println("Malini" + tab_line+"Iyer");
        System.out.println("Malini" + back_space +"Iyer");


        System.out.println("Hi" + carriage_return +"World");

        char c9='A';
        //ASCII--> A=65
        // unicode--> rupee sign, dollar=$, etc.

        char dollar='$';
        int amount=100;
        System.out.println("I have" +" "+dollar +amount);




    }
}
