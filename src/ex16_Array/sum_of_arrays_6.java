package ex16_Array;

public class sum_of_arrays_6 {
    public static void main(String[] args) {
        int[] array={12,34,10};
        //int sum=0;-->34+12+10->56
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];

        }
        System.out.println(sum);

    }
}
