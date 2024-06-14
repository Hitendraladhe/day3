import java.util.Arrays;
import java.util.Scanner;

public class swap_number {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int num_first = sc.nextInt();
        int num_second =sc.nextInt();

        int temp ;
        temp = num_first;
        num_first = num_second;
        num_second = temp;
        System.out.println("first number " + num_first);
        System.out.println("second number " + num_second);

    }
}
