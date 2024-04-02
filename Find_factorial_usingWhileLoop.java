package Basic_Question;
import  java.util.Scanner;
public class Find_factorial_usingWhileLoop {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        System.out.println("Enter number and find Factorial\n");
        int n=sc.nextInt();
        if(n==0)
        {
            fact=1;
            System.out.println(fact);
        }
        else if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else{
        for(i=1;i<=n;fact=fact*i,i++);
            System.out.println(fact);
        }

    }
    }
