package ex2;
import java.time.LocalDate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player1 p=new Player1();
		PlayerBO pbo = new PlayerBO();
		List<Player1> player = new ArrayList<Player1>();
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String detail=sc.nextLine();
			String[] details = detail.split("\\,");
			Player1 p1 = new Player1(details[0],LocalDate.parse(details[1]),details[2],Integer.parseInt(details[3]),
					Integer.parseInt(details[4]),Integer.parseInt(details[5]),details[6],Double.parseDouble(details[7]));
			player.add(p1);
		}
		
		System.out.println("Enter a search type:");
		System.out.println("1.By Nationality");
		System.out.println("2.By Date of Birth");
		System.out.println("3.By Power Rating");
		
		int ans = sc.nextInt();
		switch(ans) {
		
		case 1:
			System.out.println("Enter the nationality");
			String nationality = sc.next();
			
			List<Player1> nation = pbo.findPlayer(player, nationality);
			System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%s\n","Name","DateOfBirth",
					"Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for(Player1 p1: nation) {
				System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
		case 2:
			System.out.println("Enter the Date of Birth:");
			String date =sc.next();
			LocalDate dob = LocalDate.parse(date);
			
			List<Player1> dateofbirth = pbo.findPlayer(player, dob);
			System.out.printf("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%s\n","Name","DateOfBirth",
					"Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for(Player1 p1: dateofbirth) {
				System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
		case 3:
			System.out.println("Enter the Power Rating:");
			Double powr =sc.nextDouble();
			
			List<Player1> powerrating = pbo.findPlayer(player, powr);
			System.out.printf("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%s\n","Name","DateOfBirth",
					"Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for(Player1 p1: powerrating) {
				System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
			default:
			System.out.println("Invalid choice");
			
			
		}
		

	}

}
