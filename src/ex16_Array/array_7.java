package ex16_Array;

import java.util.Arrays;

public class array_7 {
    public static void main(String[] args) {
        //second largest number

        int[] num={12,34,10,1};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);


    }
}
