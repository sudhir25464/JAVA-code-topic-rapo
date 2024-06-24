package Arrays_DSA;

import java.util.Scanner;

public class TargetSum {

    public  static  int prifixSum(int [] arr){

        int n = arr.length;

        for(int i =0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i] == arr [j]){
                    arr[i]=-1;
                    arr[j] =-1;
                }
            }
        }

        int ans = -1;
        for(int i =0 ; i< n; i++){
            if (arr[i]>0){ // arr[i] !=-1

                ans= arr[i];
            }
        }
        return  ans;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the value of array");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("Enter taget");
        int target = sc.nextInt();

        int result = prifixSum(arr);
        System.out.println("sum of target value is " + result);
    }
}
