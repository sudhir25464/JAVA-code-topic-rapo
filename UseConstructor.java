package DSA_Coding;

import java.util.Scanner;

/**
  * InnerUseConstructor
  */
 class Algebra{

    int a; int b;


     Algebra (int x, int y){
        System.out.println("Constructor iscalled");
        a=x;
        b=y;
    }
    int sum(){
        int ans= a+b;
        return ans;
    }
    int sub(){
        int ans = a-b;
        return ans;

    }
    int mult(){
        int ans = a*b;
        return ans;
    }
    int div(){
        int ans= a/b;
        return ans;
    }

 }
public class UseConstructor {
    public static void main(String[] args) {
        
        System.out.println("Enter two number");

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        Algebra obj1= new Algebra(a,b);

        System.out.println("Ans is"+obj1.sum());
        System.out.println("Ans is"+obj1.sub());
        System.out.println("Ans is"+obj1.mult());
        System.out.println("Ans is"+obj1.div());
        
    }
    
}
