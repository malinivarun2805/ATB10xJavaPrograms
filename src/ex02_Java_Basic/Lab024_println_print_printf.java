package ex02_Java_Basic;

public class Lab024_println_print_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.print(a);
        System.out.println(a);

        System.out.printf("Your variable a is %d",a);
       /* %d is used for int, byte, long and short
          %s is used for string
          %f is used for float and double
          %b is used for boolean
        */
        byte b=12;
        System.out.println();
        System.out.printf("%d",b);
    }
}
