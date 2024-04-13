package LiveClass_Consept;
import java.util.Scanner;

class test{

    public  void sum(int...x){
        int s=0;
        for (int i:x)
            s=s+i;
        System.out.println("sum = "+s);

    }
}
public class Elips_datatype_FindSum {
    public static void main(String[] args) {

        test t= new test();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number for mate , ,");
        int n=sc.nextInt();
        t.sum(n,n,n,n);
        //t.sum(10,20);
       // t.sum(10,20,30,40,50);
    }
}
