package Arrays_DSA;

import java.util.Scanner;
import  java.util.Scanner;

public class FondFirstRepetedvalue {

    static   int firstRepetedvale(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){

            for(int j = i+1; j<n; j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }

        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter array of element");
        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First repeating value "+firstRepetedvale(arr));
    }
}
