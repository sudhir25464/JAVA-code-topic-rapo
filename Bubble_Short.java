package DSA_question_practic;

public class Bubble_Short {
    public static void main(String[] args) {

        int a[]={20,30,40,70,5762,23,0,563};

        System.out.println("Given array values are ");
        for (int i=0 ;i<a.length;i++){
            System.out.print(a[i]+" ");
        }



        for (int i=0 ;i<a.length;i++){

            for (int j=0; j<a.length-1;j++){

                if (a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;

                }
            }
        }

        // print arrays
        System.out.println("\n Shorted Array values  are \n ");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
