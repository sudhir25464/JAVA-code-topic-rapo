package Arrays_DSA;
import  java.util.Scanner;

public class Count_x_element {
//    static   int  countElement(int []arr, int x) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                count = count + 1;
//            }
//        }
//    return  count;
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size =5;
        int [] arr = new int[size];
        System.out.println("Enter Array of elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the x element for count");
        int x = sc.nextInt();

        int count = 0 ;
        for(int i = 0 ; i< arr.length; i++){
            if (arr[i]==x){
                count ++;
            }
        }
        System.out.println(count);
//        System.out.print("count elemts ", countElement(arr, x));


    }
}
