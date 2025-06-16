package ex10_For_Loops;

public class Lab105_For_loop16_continue3 {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even --> " +i );
                continue;
            }
            System.out.println(i);
        }
    }
}
