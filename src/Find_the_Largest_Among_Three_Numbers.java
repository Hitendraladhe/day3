import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Largest_Among_Three_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first_num = sc.nextInt();

        System.out.println("Enter the first number ");
        int second_num = sc.nextInt();

        System.out.println("Enter the first number ");
        int third_num = sc.nextInt();

        double res=(first_num > second_num) ? (first_num > third_num ? first_num : third_num) : (second_num > third_num ? second_num : third_num);
        System.out.println("the largest among three number "+ "first "+ first_num+" second "+ second_num + " third "+ third_num +" is "+res);
    }
}
