package ex06_Ternary_Operators;

public class Lab056_maxOfThree {
    public static void main(String[] args) {
        //find largest num of 3
        int n1=2;
        int n2=9;
        int n3=-11;
        int result=(n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
        System.out.println(result);
    }
}
