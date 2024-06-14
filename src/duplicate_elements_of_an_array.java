//Java Program to print the duplicate elements of an array

public class duplicate_elements_of_an_array{
    public static void main(String[] args){
        System.out.println("Hello print the duplicate elements of an array");
        int[] array = {2, 3, 4, 5, 8, 3, 4, 5, 5, 6, 7, 7, 8, 8, 8, 8, 9, 0, 7, 65, 4, 3, 2, 1, 1, 1};
        boolean is_doublicate = false;
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    is_doublicate=true;
                    System.out.println(array[i]+ " is doublicate element in the string !");
                }
            }
        }
    }
}
