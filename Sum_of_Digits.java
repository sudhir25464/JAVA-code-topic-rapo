package DSA_Coding;
import java.util.*;
public class Sum_of_Digits {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number");
        int n= sc.nextInt();
        int orginal_n=n;
       int SumofDigit=0;

        while (n > 0) {

            SumofDigit += n % 10;
            n=n/10;
        }
        System.out.println( "Numner of Digit in" +orginal_n+" = "+SumofDigit);

    }
    
}
