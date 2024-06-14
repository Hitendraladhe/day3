import java.util.Random;
import java.util.Scanner;

class coin_flip_and_percentage_cal{
    public static void main(String[] args){
        double randum  = 0.0;
        int tails = 0;
        int heads = 0;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        while(count <= flips){
            randum = Math.random();
            System.out.println(randum + " " );

            if(randum < 0.5){
                tails++;
            }
            else{
                heads++;
            }
            count++;
        }
    double tails_per = (double)flips/tails*100;
    double heads_per =  (double)flips/heads*100;
    System.out.println("Percentage of tails is "+tails_per);
    System.out.println("Percentage of heads is "+heads_per);
    }
}
