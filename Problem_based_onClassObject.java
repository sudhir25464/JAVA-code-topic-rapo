package OOPs;

//  Q: Create a person class where represent basic information like name address age and with varios method

class  persion{

    // filed
    private  String name;
    private  String address;
    private  int age;
    // method
    public void  setName(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public  void setaddress(String address){
        this.address = address;
    }

    // desplay details method

    public void  displayDetails(){
        System.out.println("name is " + this.name);
        System.out.println("age is " + this.age);
        System.out.println("address" + this.address);
    }
}
public class Problem_based_onClassObject {
    public static void main(String[] args) {

        persion p1= new persion();
        p1.setName("sudhir kumar");
        p1.setage(21);
        p1.setaddress("patna Bihar 847226");

        p1.displayDetails();
        // create second object

        persion p2 = new persion();
        p2.setName("Rahul");
        p2.setage(30);
        p2.setaddress("Village: jaynager, madhubani , bihar");

        System.out.println("second persion details");
        p2.displayDetails();
    }

}
