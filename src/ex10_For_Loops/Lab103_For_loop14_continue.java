package ex10_For_Loops;

public class Lab103_For_loop14_continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i==5)
            {
                continue;
                // skip and move to below code and move to top
            }
            System.out.println(i);
        }
    }
}
