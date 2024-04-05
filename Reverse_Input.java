package DSA_Coding;

import java.util.Scanner;

public class Reverse_Input {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

      
        System.out.println("Enter Digits");
        int n = sc.nextInt();

        int revAns=0;
        while (n >0) {

            revAns= revAns * 10 + n %10;
            n /= 10; 
            
        }

        System.out.println(revAns);
    }
    
}
