import java.util.*;
public class EmployeeMain1 {
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

        System.out.println("Verify and Update the details");
        int temp=0;
        while(temp!=4){
        
        System.out.println("Menu");
        System.out.println("1. Update Employee name");
        System.out.println("2. Update Employee Address");
        System.out.println("3. Update Employee mobile");
        System.out.println("4. All information correct/Exit");
        temp = sc.nextInt();
        sc.nextLine();

        switch(temp){
            case 1:
            System.out.println("Current name is: "+emp1.getName());
            System.out.println("Enter the name:");
            emp1.setName(sc.nextLine());
            break;
            case 2:
            System.out.println("Current address is: "+emp1.getAddress());
            System.out.println("Enter the address:");
            emp1.setAddress(sc.nextLine());
            break;

            case 3:
            System.out.println("Current mobile is: "+emp1.getMobile());
            System.out.println("Enter the mobile:");
            emp1.setMobile(sc.nextLine());
            break;

            case 4:
            System.out.println("Name: "+ emp1.getName());
            System.out.println("Address: "+ emp1.getAddress());
            System.out.println("Mobile: "+ emp1.getMobile());
            break;
        }

        
            }

        }
        




        
    }
