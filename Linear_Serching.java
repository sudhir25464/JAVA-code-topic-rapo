package DSA_question_practic;
import  java.util.Scanner;

class test{
   static int size;
   int key;
  static  int  a[]= new int[size];

  void getdata(){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter size of array");
       size= sc.nextInt();
       int  a[]= new int[size];
       System.out.println("Enter vaalue of array");
       for (int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }


       System.out.println("Enter serch value ");
       key=sc.nextInt();

  }
  void  displayArray(){
      System.out.println("vaalue of array");
      for (int i=0;i<a.length;i++){
         System.out.println(a[i]);
      }
  }
}
public class Linear_Serching {
    public static void main(String[] args) {

        test t= new test();
        t.getdata();
        t.displayArray();
        //incompele  program
    }
}
