package DSA_Coding;

import java.util.Scanner;


class checkpalindrome{
    public boolean ispalindrome(int number){
        int org_number= number;
        int reverse= 0 ;
        while( number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return org_number == reverse;

    }
}

public class CheckPalindromUsingObjectAndClass {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();

        checkpalindrome result= new checkpalindrome();
        
        boolean ispalindrom = result.ispalindrome(number);

        if (ispalindrom == true) {
            System.out.println(number +" is  a palindrome number");
        }else{
            System.out.println(number +"is not palindrome number");
        }

    }
    
}
