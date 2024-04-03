package Basic_Question;
import  java.util.Scanner;
public class calculate_cgp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();

        float cgp=(m1+m2+m3)/30;
        System.out.println("Your CGP : "+cgp);

    }
}
