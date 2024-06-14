import java.util.Scanner;

public class countDigitInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len =  String.valueOf(num).length();
        System.out.printf("The digit in number is "+len);
    }
}
