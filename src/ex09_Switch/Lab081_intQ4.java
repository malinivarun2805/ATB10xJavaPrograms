package ex09_Switch;

public class Lab081_intQ4 {
    public static void main(String[] args) {

        int itemcode=007;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All are Electronics Gadgets");
                break;

            case 004,006,007:
                System.out.println("This is Mech");
                break;

            default:
                System.out.println("None");
                break;

        }
    }
}
