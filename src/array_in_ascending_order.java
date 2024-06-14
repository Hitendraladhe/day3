import java.util.Arrays;

public class array_in_ascending_order {
    public static void main (String[] args){
        System.out.println("Hello print the accending order elements of an array");
        int[] array = {3, 2, 4, 5, 4, 5, 5, 7, 7, 7, 9, 9};
        for (int i=0; i<array.length; i++){
            for (int j=i; j<array.length; j++){
                System.out.println(array[i]+" "+ array[j]);
                //this is for accending order
                if(array[i]> array[j]){
                    //System.out.println(array[i]+" "+ array[j]);
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
                // this is for deccending order
//                if(array[i]< array[j]){
//                    //System.out.println(array[i]+" "+ array[j]);
//                    int t = array[i];
//                    array[i] = array[j];
//                    array[j] = t;
//                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


//for (int i=0; i<array.length; i++){
//  for (int j  = i; j < array.length ; j++){
//      if (array[i] > array[j]){
//          int t = array[i];
//          array[i] = array[j];
//          array[j] = t;
//  }
//}
