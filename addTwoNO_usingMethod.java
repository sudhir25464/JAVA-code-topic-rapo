package DSA_Coding;

import java.util.Scanner;

class algebra{

    public int sum (int a , int b){

        int ans= a+b;
        return ans;
    }
}

public class addTwoNO_usingMethod {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();

        algebra add = new algebra();

        int finalsum = add.sum(x,y);
        System.out.println(finalsum);

    }
    
}
