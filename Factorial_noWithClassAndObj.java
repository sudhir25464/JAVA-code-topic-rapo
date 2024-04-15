package Concept_Practis;

import java.util.Scanner;

class factorial{

    public void findfactorial(int number){

        int fact = 1;
       
        for(int i=1; i<=number; i++){
            fact = fact*i;

        }
    System.out.println("factorial of given number is "+fact);

    }
}
public class Factorial_noWithClassAndObj {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        factorial obj = new factorial();
        obj.findfactorial(n);
    }
    
}
