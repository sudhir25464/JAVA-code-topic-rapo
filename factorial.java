package Basic_Question;

import  java.util.Scanner;


public class factorial {

    static  int fact(int n){

        if (n<1 || n==1){
        return  1;
            }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number");
        int n=sc.nextInt();

        fact(n);
        System.out.println("factorial is "+ fact(n));

    }
}
