import java.util.*;
public class EmployeeMain {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        System.out.println("Enter the name:");
        emp1.setName(sc.nextLine());
        System.out.println("Enter Address:");
        emp1.setAddress(sc.nextLine());
        System.out.println("Enter Mobile:");
        emp1.setMobile(sc.nextLine());

        System.out.println("EmployeeDetails");
        System.out.println("Name: "+ emp1.getName());
        System.out.println("Address: "+ emp1.getAddress());
        System.out.println("Mobile: "+ emp1.getMobile());


        
    }



}
