import java.util.*;
public class Main1 {
	static String names;
	static String[] name;
	public static void main(String[] ar) {
		Scanner sc= new Scanner(System.in);
		
		TreeSet<Team> teams = new TreeSet<Team>();
		
		int numInputs = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < numInputs; i++) {
            String[] teamPlayer = sc.nextLine().split("\\|");
            String teamname = teamPlayer[0];
            String playername = teamPlayer[1];
			Team team =null;
			for (Team t : teams) {
                if (t.getName().equals(teamname)) {
                    team = t;
                    break;
                }
            }
            if (team == null) {
                team = new Team(teamname);
                teams.add(team);
            }
            
            team.addPlayer(new Player(playername));
			
		}
        
        System.out.println("Teams and Players in ascending order");
		for (Team t : teams) {
            System.out.println(t.getName());
            List<Player> players = t.getPlayerList();
            for (Player p : players) {
                System.out.println("--"+ p.getName());
            }
        }
		

		
		
	}
}
