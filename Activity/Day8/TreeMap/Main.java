import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String,Player> ts = new TreeMap<>();
		
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of player "+ (i+1));
			String cap = sc.next();
			String name = sc.next();
			String team = sc.next();
			String skill = sc.next();
			
			ts.put(cap, new Player(name,team,skill));
			
			
		}
		
		System.out.println("Player Details");
		
		for(Map.Entry<String, Player> entry : ts.entrySet()) {
			String capno = entry.getKey();
			Player p = entry.getValue();
			
			System.out.println(capno+"--"+p.getName()+"--"+p.getTeam()+"--"+p.getSkill());
		}
		

	}

}
