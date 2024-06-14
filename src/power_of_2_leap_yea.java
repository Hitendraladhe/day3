import java.util.Scanner;
public class power_of_2_leap_yea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int number = 0;
        if (num.isEmpty()) {
            System.out.println("Please provide a value for N as a command-line argument");
        } else {
            number = Integer.parseInt(num);
        }
        int result = 2;
        for (int i = 1; i < number+1; i++) {
            int res = 2 << i;
//          int res = Math.pow(2, i)
//            result *= 2;
            System.out.println("2^" + i + " = " + res);
        }
    }
}
