import java.util.*;
public class InningsMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Innings inn = new Innings(); 
        System.out.println("Enter the team name: ");
        inn.setTeamName(sc.nextLine());
        System.out.println("Enter Session:");
        inn.setInningsName(sc.nextLine());
        System.out.println("Enter runs:");
        inn.setRuns(sc.nextInt());

        inn.displayInningDetails();

    }
}
