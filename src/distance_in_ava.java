import java.util.Scanner;

public class distance_in_ava {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double y = sc.nextInt();

        // Calculate distance
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance from origin (0,0) X "+x+" Y "+y+" Distance = "+distance);
    }
}
