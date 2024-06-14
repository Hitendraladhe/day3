

public class array_present_on_odd_position {
    public static void main (String [] args){
        System.out.println("Hello array present on odd position");
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8, 88};
        for (int i=0; i<array.length; i++){
            if (i%2!=0){
                System.out.println("array present on odd position "+i+" "+array[i]);
            }
        }
    }
}
