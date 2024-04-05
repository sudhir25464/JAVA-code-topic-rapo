package DSA_Coding;

import java.util.Scanner;

public class Sum_of_Given_series {
    public static void main(String[] args) {
        
        //  given series is 1-2+3-4+5...n;

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;

        for(int i=1 ;  i<= n; i++){

            if (i % 2 ==0 ) {
                ans -= i;

                
            }
            else{
                ans += i;
            }
        }
        System.out.println(ans);
    }
    
}
