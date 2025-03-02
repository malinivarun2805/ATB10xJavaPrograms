package ex16_Array;

import java.util.Arrays;

public class array_3_iteration_forloop {
    public static void main(String[] args) {
        int[] marks={12,23,34,45,56};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
    }
}
