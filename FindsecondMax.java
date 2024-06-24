package Arrays_DSA;

import java.util.Scanner;

public class FindsecondMax {
    static  int findMax(int[] arr){

        int max= Integer.MIN_VALUE;

        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]>max){

                max= arr[i];
            }
        }
        return  max;
    }

    static  int  secondMax(int [] arr){
        int max = findMax(arr);

        for(int i =0 ; i<arr.length; i++){
            if(arr[i]== max){

                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMAX = findMax(arr);
        return  secondMAX;
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


        System.out.println("Second aary of max value "+secondMax(arr));
    }
}
