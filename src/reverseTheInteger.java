import java.util.Scanner;

public class reverseTheInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int len =  String.valueOf(number).length();
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            System.out.println("number and digit "+number+ " "+digit);
            reversedNumber = reversedNumber * 10 + digit;
            System.out.println(reversedNumber);
            number /= 10;
        }

        System.out.printf("The rev of Integer is "+reversedNumber);
    }
}
