import java.util.Arrays;
import java.util.Scanner;

public class calculate_the_quosient_and_reminder {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = number / divisor;
        int reminder = number % divisor;

        System.out.println("quotient " + quotient);
        System.out.println("reminder " + reminder);
    }
}
