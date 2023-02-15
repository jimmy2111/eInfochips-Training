import java.util.*;
import java.time.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Match> match = new TreeSet<Match>();
		System.out.println("Enter the number of matches");
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println("Enter match date in (yyyy-MM-dd)");
			LocalDate mdate = LocalDate.parse(sc.next());
			sc.nextLine();
			System.out.println("Enter Team 1");
			String team1 = sc.nextLine();
			System.out.println("Enter Team 2");
			String team2 = sc.nextLine();
			
			match.add(new Match(mdate,team1,team2));
			
			
		}
//		Collections.sort(match);
//		Collections.reverse(match);
		System.out.println("Match Details");
		
		for(Match m : match) {
			System.out.println("Team 1 "+ m.getTeamOne());
			System.out.println("Team 2: "+ m.getTeamTwo());
			System.out.println("Match Held on "+m.getMatchDate());
		}
		

	}

}
