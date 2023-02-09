import java.util.*;
public class CustomerMain {
    public static void main(String[] args) {
        System.out.println("Enter the details:");
        Scanner sc= new Scanner(System.in);
        String detail = sc.nextLine();

        String[] custdetail = detail.split(",");

        Customer cust1 = new Customer();

        cust1.setName(custdetail[0]);
        cust1.setAddress(custdetail[1]);
        cust1.setMobile(custdetail[2]);

        System.out.println("Name: "+ cust1.getName());
        System.out.println("Address: "+ cust1.getAddress());
        System.out.println("Mobile: "+ cust1.getMobile());
        
    }
}
