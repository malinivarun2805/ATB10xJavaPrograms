package ex15_String_Functions;

public class Lab145_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String Builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        // String Buffer-- Object/heap area
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        //concatenation
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        String s4 = s1 + s2;
        System.out.println(s4);
    }
}
