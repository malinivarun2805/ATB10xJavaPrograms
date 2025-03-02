package ex06_Ternary_Operators;

public class Lab057_age_classification {
    public static void main(String[] args) {
        int age=25;

        String result=(age<18)?"Minor":((age<65)?"Adult":"Senior Citizen");
        System.out.println(result);

    }
}
