//Java Program to print the largest element in an array

class larget_number_in_array {
    public static void main (String[] args){
        System.out.println("Hello this is Largest number ");
        int array[] = {15, 3, 2, 5, 6, 7, 8, 9, 9, 9, 87, 6, 6 ,5};
        int max_num = array[0];
        boolean is_max = false;
        for (int i=1; i<array.length; i++) {
            if (array[i] > max_num) {
                max_num = array[i];
                is_max = true;
            }
        }
        System.out.println(max_num);
    }
}
