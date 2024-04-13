package LiveClass_Consept;

public class ArthmeaticException {
    public static void main(String[] args) {

        int x=10, y  =0;
        try
        {

            System.out.println(x/y);

        }
        catch (ArithmeticException e){


            // Arithmeric Axcept

            System.out.println(e.getMessage());

        }
        System.out.println("Bye program");
    }
}
