package Basic_Question;
import java.util.Scanner;
public class Enter_string_printIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name =sc.nextLine();
        System.out.println("Hellow   " + name + "  you have a good day ,today");


        // Enter number and check it int or float;
        System.out.println("Enter number");
        System.out.println(sc.hasNextInt());
    }
}
