import java.util.Arrays;
import java.util.Scanner;

public class Check_Whether_an_Alphabet_is_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            System.out.println("Alphabet "+ch+ " is Vowels " );
        }
        else{
            System.out.println("Alphabet "+ch+ " is Consonant " );
        }
    }
}
