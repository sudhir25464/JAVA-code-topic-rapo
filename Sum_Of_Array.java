package DSA_Coding;

import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args) {
        
        int size =10;

        int [] arr = new int [size];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter "+size+" array elements");

        int sum = 0;
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
            
            sum = sum+arr[i];
        }

        System.out.println("Sum of Given Array is"+ sum);

    




    }
    
}
