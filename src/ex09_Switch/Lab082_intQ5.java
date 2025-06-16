package ex09_Switch;

public class Lab082_intQ5 {
    public static void main(String[] args) {

        int itemcode=001;

        switch (itemcode){
            case 001,002,004 -> System.out.println("Electronics Gadgets");
            case 003,005,006 -> System.out.println("Mech");
            default -> System.out.println("None");
        }
    }
}
