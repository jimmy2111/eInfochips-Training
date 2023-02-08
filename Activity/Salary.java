import java.util.*;
public class Salary{
    public static void main(String[] args){
        System.out.println("Enter the salary amount : ");
        Scanner sc=new Scanner(System.in);
        int sal = sc.nextInt();
        if(sal > 8000){
            System.out.println("Salary too large");
            return;
        }
        else if(sal < 0){
            System.out.println("Salary too small");
            return;

        }
        else{
            System.out.println("Enter number of shifts:");
            Scanner sc1 = new Scanner(System.in);
            int shift = sc1.nextInt();
            if(shift<0){
                System.out.println("Shift too small");
            }
            double save = (sal*0.5) + (shift*sal*0.02);
            int sa = (int)save;
            System.out.println(sa);
        }

    }
}