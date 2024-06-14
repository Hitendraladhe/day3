import java.util.Arrays;
import java.util.Scanner;

public class sum_of_three_int_add_zero {
    public static void main(String[] args){
        int [] array = {1, 2, 3, 4, 4, 5, -5, 6, -6, 7, -7, 7, -9};
        int []res_array = {};
        for (int i=0; i < array.length; i++){
            int sum = 0;
            for (int j=0; j < array.length; j++){
                sum= array[i]+ array[j] + array[array.length-j-1];
                //System.out.println(sum);
                if (sum == 0){
                    //System.out.println("yes");
                    System.out.println(String.valueOf(array[i])+" "+ String.valueOf(array[j])+" " + String.valueOf(array[array.length-j-1]));
                    //res_array.addList{array[i]+ array[j] + array[array.length-j-1]};
                }
            }
        }
    }
}
