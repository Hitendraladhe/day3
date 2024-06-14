import java.util.Arrays;
import java.util.Scanner;

public class twoD_Array {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int columns = sc.nextInt();
        int rows = sc.nextInt();

        for (int i=0; i < columns; i++){
            String pattern = "";
            for(int j=1; j < rows+1; j++){
                // to convert integer into String we can also use String.valueOf(j)
                pattern = pattern +  Integer.toString(j) +" ";
            }
         System.out.println(pattern);
        }
    }
}
