import java.util.Arrays;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("hello");
        for (int i = 2;   i <= number; i++) {
            // While i divides N, print i and divide N
            while (number % i == 0) {
                System.out.print("Number is "+ number +" "+"Prime factors is "+ i);
                number /= i;
            }
        }
    }
}
