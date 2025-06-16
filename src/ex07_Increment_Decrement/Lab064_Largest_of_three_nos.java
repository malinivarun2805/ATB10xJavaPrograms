package ex07_Increment_Decrement;

public class Lab064_Largest_of_three_nos {
    public static void main(String[] args) {
        /*
        n1=89;
        n2=70;
        n3=-90;
        */

        int n1=89;
        int n2=170;
        int n3=90;
        int result=(n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
        System.out.println("The largest number is "+result);
    }
}
