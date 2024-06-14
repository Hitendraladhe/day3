// Java Program to find the frequency of each element in the array

public class frq_of_ele {
   public static void main (String[] args){
       System.out.print("hello Java world I'm Hitendra");
       int[] frq  = {1, 2, 35, 6, 6, 5, 3, 2, 17, 7, 9, 44};
       for(int i=0; i<frq.length; i++){
//           System.out.print(frq[i]);
           int  count  = 0;
           for (int j=0; j< frq.length; j++){
               if (frq[i] == frq[j]){
                   count++;
               }
           }
           System.out.println("count of "+ frq[i] +" is "+count);

       }


   }
}
