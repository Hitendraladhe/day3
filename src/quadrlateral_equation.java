import java.util.Arrays;
import java.util.Scanner;

public class quadrlateral_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextInt();

        double delta = Math.pow(2, num1)-(4*num1*num3);

        //Root 1 of x = (-b + sqrt(delta))/(2*a)
        //Root 2 of x = (-b - sqrt(delta))/(2*a)

        double root1 = (-num1 + Math.sqrt(delta))/ (2*num1);
        double root2 = (-num1 - Math.sqrt(delta))/ (2*num1);
        System.out.println("The root of the ax*2 + bx + c is "+root1+" "+root2);
    }
}
