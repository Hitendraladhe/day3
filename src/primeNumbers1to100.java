//Java Program to print the elements of an array present on an even position

public class primeNumbers1to100 {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
                 for(int j=2; j<i; j++){
                     if(i%j==0){
                         System.out.println(i);
                         break;
                     }
                 }

            System.out.println(i);
            }
        }
}



























//        System.out.println("Hello array elements in even position ");
//        int[] array = {2, 2, 2, 3, 4, 5, 7, 8, 2, 2, 2, 5, 45, 56, 6, 7, 7, 88, 8};
//        for (int i=0; i<array.length; i++){
//            if (i % 2==0){
//
//                System.out.println("array elements in even position "+i+" "+array[i]);
//
//            }
//        }
