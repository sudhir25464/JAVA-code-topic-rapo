package LiveClass_Consept;
import  java.util.*;
import  java.lang.System;
public class Bubbleshort_DyanmicArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n[],i,size, j,t;
        System.out.println("Enter the size of Array");
         size=sc.nextInt();
         n= new int[size];

         System.out.println("Enter "+size+"value of arrys");
         for (i=0;i<=size;i++){
             n[i]=sc.nextInt();
         }
         // Here print Array this is Initial ARRAYS VALUES


        for (i=0;i<size-1;i++){
            for (j=0;j<size-i; j++ ){
                if (n[j]>n[j+1]){
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;

                }
            }
        }

        for (i=0;i<n.length;i++){
            System.out.println(n[i]);
        }


    }
}
