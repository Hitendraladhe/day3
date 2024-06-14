import java.util.Scanner;
//import java.util.*;
//import java.lang.*;

class find_leap_year {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        //System.out.println(num);

        if(num.length() == 4){
            int number = Integer.parseInt(num);
            if (number % 400 == 0 && number % 100 ==0){
                System.out.println("this is leap");
            } else if(number % 4 == 0 && number % 100 != 0){
                System.out.println("this is leap");
            }else{
                System.out.println("is not leap");
            }
        }
    }
}
