import java.util.Arrays;
import java.util.Scanner;

class harmonic_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num != 0){
            double sum=0.0;
            for (int i=1; i<=num; i++){
                sum=sum + (double)1/i;
                System.out.println(i+" "+sum);
            }
            System.out.println( "harmonic number of "+num+" "+ sum);
        }
        else {
            System.out.println("Invalid input, please enter integer ");
        }
    }
}
