import java.util.Arrays;

public class array_in_reverse_order {
    public static void main(String[] args){
        System.out.println("Hello print array in reverse order ");
        int[] array = {2, 2, 2, 3, 4, 5, 7, 8, 2, 2, 2, 5, 45, 56, 6, 7, 7, 88, 8};

//        int i = 0;
//        int j = array.length-1;
//        while(i < j){
//            int t = array[i];
//            array[i] = array[j];
//            array[j] = t;
//            i++;
//            j--;
//        }
        int i = 0;
        int j = array.length-1;
        while(i<j){
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(array));
    }
}
