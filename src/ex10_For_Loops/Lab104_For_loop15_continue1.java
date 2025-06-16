package ex10_For_Loops;

public class Lab104_For_loop15_continue1 {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
