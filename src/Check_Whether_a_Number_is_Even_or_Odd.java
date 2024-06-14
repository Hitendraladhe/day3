import java.util.Arrays;
import java.util.Scanner;

public class Check_Whether_a_Number_is_Even_or_Odd {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 ==0){
            System.out.println(number+" number is Even");
        }
        else{
            System.out.println(number+" number is Odd");
        }
    }
}
