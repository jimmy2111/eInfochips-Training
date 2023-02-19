package ex3;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		
		List<Player> p = new ArrayList<Player>();
		
		System.out.println("Enter the number of players:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String det = sc.nextLine();
			Player p1 = player.createPlayer(det);
			p.add(p1);
		}
		System.out.println("Enter a type to sort:");
		System.out.println("1.Sort by number of matches played");
		System.out.println("2.Sort by runs scored");
		System.out.println("3.Sort by power rating");
		int ans = sc.nextInt();
		
		switch(ans) {
		
		case 1 : 
			Collections.sort(p);
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%s\n","Name","Date of birth",
					"Skill","No of matches","Runs","Wickets","Nationality","Power Rating");
			for(Player p1: p) {
				System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
		case 2:
			Comparator run = (o1,o2) -> {
				if((((Player) o1).getRuns()) > ((Player)o2).getRuns()) {
					return 1;
				}
				else if((((Player) o1).getRuns()) < ((Player)o2).getRuns()) {
					return -1;
				}
				else {
					return 0;
				}
				
			};
			Collections.sort(p, run);
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%s\n","Name","Date of birth",
					"Skill","No of matches","Runs","Wickets","Nationality","Power Rating");
			for(Player p1: p) {
				System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
		case 3:
			Collections.sort(p, new PowerRatingComaparator());
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%s\n","Name","Date of birth",
					"Skill","No of matches","Runs","Wickets","Nationality","Power Rating");
			for(Player p1: p) {
				System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%.1f\n",p1.getName(),p1.getDateOfBirth(),p1.getSkill(),
						p1.getNumberOfMatches(),p1.getRuns(),p1.getWickets(),p1.getNationality(),p1.getPowerRating());
			}
			break;
			
			default: System.out.println("Invalid choice");
			
		
		}
		

	}

}
