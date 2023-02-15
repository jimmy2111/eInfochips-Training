import java.util.*;
public class Main {
	static String skills;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player();
		ArrayList<Player> ts = new ArrayList<Player>();
		
		System.out.println("Please provide the number of players to be registered");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Please enter player name");
			String name = sc.next();
			System.out.println("Please select the skill of the player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			int sk = sc.nextInt();
			
			if(sk==1) {
				skills= "All Rounder";
				
			}
			if(sk==2) {
				skills= "Batsman";
				
			}
			if(sk==3) {
				skills="Bowler";
				
			}
			
			ts.add(new Player(name,skills));
			
			
			
			
		}
		Collections.sort(ts, new PlayerComparator());
		System.out.println("Player Details");
		for (Player p :ts ) {
			System.out.println("Player : "+p.getName()+" Skill : "+p.getSkill());
		}
		
	}
 
}
