package DSA_Coding;

import java.util.Scanner;

public class ConbertBinaryToDecimal {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter binary digit");
        int binary_Digit= sc.nextInt();

        int finalans=0;
        int pw=1;
        while(binary_Digit > 0){

            int unit_Digit = binary_Digit %10;
            finalans += (unit_Digit*pw);
            binary_Digit /=10;
            pw*=2;

        }
        System.out.println(finalans);
    }
}
