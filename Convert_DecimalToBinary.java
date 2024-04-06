package DSA_Coding;

import java.util.Scanner;

public class Convert_DecimalToBinary {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

         System.out.println("Enter any number");
         int decimal_num= sc.nextInt();
         int pw= 1;
         int ans=0;

         if (decimal_num < 0 ) {
            
            System.out.println("Invalid input");
         }else{

         
         while(decimal_num > 0 ){

            int parity = decimal_num % 2;
            ans += (parity *pw);
            pw *=10;
            decimal_num /=2;



         }
          
         System.out.println(ans);
        }
     }
    
}
