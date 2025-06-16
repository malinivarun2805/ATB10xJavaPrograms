package ex10_For_Loops;

public class Lab101_For_loop12_odd_even {
    public static void main(String[] args) {
        // even odd 50
        // to find even and odd from 1 to 50

        for (int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even-> " +i);
            }
            else
            {
                System.out.println("Odd--> " +i);
            }
        }
    }
}
