import java.util.*;
public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company com = new Company();

        System.out.println("Enter the company name:");
        com.setName(sc.nextLine());
        System.out.println("Enter the employees:");
        String emp = com.setEmployees(sc.nextLine());
        System.out.println("Enter TeamLead");
        com.setTeamLead(sc.nextLine());

        String[] emp1 =  emp.split(",");

        for(int i=0; i< emp1.length; i++){
            if(com.getTeamLead().equals(emp1[i])){
            System.out.println("Name: "+ com.getName());
            System.out.println("Employees: "+com.getEmployees());
            System.out.println("Lead: "+ com.getTeamLead());
            break;
            }
            else{
                System.out.println("Invalid Input");
                break;
            }
        }
        

        
        

        
    }
}
