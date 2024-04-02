package Basic_Question;

public class Check_Array_ShortedOr_Not {
    public static void main(String[] args) {

        int [] arr={783,9983,893,92,24,33};
        boolean isshorted=true;
        for ( int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]){
                isshorted =false;
                break;
            }
        }
        if (isshorted){
            System.out.println("The array is shorted\n");
            System.out.print("List");
            for (int element:arr){
                System.out.println(element);
            }
        }else {
            System.out.println("The array is not shorted");
            System.out.print("List\n");
            for (int element:arr){
                System.out.println(element);
            }
        }
    }
}
