package ex02_Java_Basic;

public class Lab023_printf {
    public static void main(String[] args) {
      //  int num=9;
        System.out.println("9 Times Table:");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("9 x %d = %d%n", i, 9 * i);
        }

    }
}
