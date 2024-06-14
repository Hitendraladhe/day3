//Java Program to print the smallest element in an array

public class smallest_number {
    public static void main(String[] args){
        System.out.println("Hello this is Smallest number in array");
        int array[] = {2, 3, 4, 5, 8, 9, 0, 7, 65, 4, 3, 2, 1, 1, 1};
        int max_num=0;
        for (int i=0; i< array.length; i++){
            max_num = array[i];
            for (int j=0; j<i+1; j++){
                if (max_num > array[j]){
                    max_num = array[j];
                }
            }
        }
        System.out.println(max_num);
    }

}
