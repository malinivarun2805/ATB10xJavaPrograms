package ex13_Functions;

public class Lab128_HW1 {

    // Reverse number using loop- 12345 to 54321
    public static void main(String[] args) {
        int num = 98476;

        int rev=0;

        for(int i=num; i>0; i=i/10)
        {
            int rem = i%10;
            rev = rev*10+rem;
        }
        System.out.println(rev);
    }
}
