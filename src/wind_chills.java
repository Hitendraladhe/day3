import java.util.Arrays;
import java.util.Scanner;

public class wind_chills {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("temperature in fahrehint: " );
        double temp = sc.nextInt();
        System.out.println("temperature in Miles per hour: " );
        double velocity = sc.nextInt();

        if (temp > 50){
            System.out.println("Enter the temperature is < 50 in absolute");
        }
        else if (3 <= velocity && velocity >= 120) {
            System.out.println("Enter the velocity in 3 <= v >= 120 in absolute");
        }
        double wind_chill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75)*Math.pow(0.16, velocity);
        System.out.println("the wind chills of temperature "+temp+" "+" velocity "+ velocity+ " is "+ wind_chill);
    }
}
