  import java.lang.reflect.Array;
import java.util.Arrays;

public class second_Largest_Number_in_an_Array {
    public static void main(String[] args){
        System.out.println("Hello this is Largest number ");
        int[] array = {15, 3, 2, 5, 7, 8, 9, 87, 6,5};
        for (int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
//                System.out.println(array[i]);
//                System.out.println(array[j]);
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
//      int arr[] = Arrays.toString(array);
        }
        System.out.println("The Second largest number of array is "+array[1]);
    }
}
