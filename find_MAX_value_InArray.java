package Basic_Question;

public class find_MAX_value_InArray {
    public static void main(String[] args) {
        int [] arr={56, 789,8993,9784, 799,-889892,-566};

       // int max=0;
        int max=Integer.MIN_VALUE;
        for (int e:arr){
            if (e>max){
                max=e;
            }
        }
        System.out.println("The maxminum value of Array is = "+max);


        // find minimum value in Array
        int min=Integer.MAX_VALUE;
        for (int e: arr){
            if (e<min){
                min=e;
            }
        }
        System.out.println("min"+min);


    }
}
