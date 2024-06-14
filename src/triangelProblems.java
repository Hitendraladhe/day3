import java.util.Scanner;

public class triangelProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int du = num;
        int spaces = num;
        for(int i=1; i<num; i++){
            String pattern = "";
            // this is for Spaces
            for(int s=spaces-1; s>=i; s--){
                System.out.print(" ");
            }
            // this is for pattern
            for (int j=1; j<i+1; j++){
                pattern += Integer.toString(du)+ " ";
                du++;
                spaces--;
            }

        System.out.println(pattern);
        }
    }
}
