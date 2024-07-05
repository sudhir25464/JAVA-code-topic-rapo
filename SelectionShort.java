package DSA_Array_codeIt;
import  java.util.Scanner;
class  demo{
    int a[] = new int[10];

    void  getdata(){
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter 10 value of array");
        for (int i=0 ; i<a.length;i++){
            a[i]=SC.nextInt();
        }
    }
    void  printdata(){
        for (int i=0 ; i<a.length;i++){
           System.out.println(a[i]);
        }
    }

    void selectionshort(){

        System.out.println("Shorted det are ");
        int i,j,t;
        for (i=0;i<9;i++)

            for (j=i+1;j<10;j++){
                if (a[j]<a[i]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
//              int temp= a[i];
//                a[i]=a[i];
//                a[i]=temp;


        }
        for (i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }

}

public class SelectionShort {
    public static void main(String[] args) {

        demo d= new demo();
        d.getdata();
        d.printdata();
        d.selectionshort();

    }
}
