package Concept_Practis;

import java.util.Scanner;

//  find reverse number
class reverse {
    public void findReverse(int n) {

        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;

        }
        System.out.println(" reverse number is = " + reverse);
    }
}

public class ReverseNo_with_objAndClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        reverse r = new reverse();
        r.findReverse(n);

    }
}
