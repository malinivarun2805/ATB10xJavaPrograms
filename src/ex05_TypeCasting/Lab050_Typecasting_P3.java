package ex05_TypeCasting;

public class Lab050_Typecasting_P3 {
    public static void main(String[] args) {
        long phone_no=865765899;
        short s=(short)phone_no;

        // where is it used?
        /*
        GST-18%
        Rs.100--> Rs.18 to gov
        -->Rs.2 to razorpay
        -->Rs.
         */
        int course_fee=100;
        float gst=18.45f;
        float total=course_fee+gst;
        System.out.println(total);



    }
}
