import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Wicket> hm = new HashMap<>();
		
		List<Wicket> wc = new ArrayList<Wicket>();
		
		String ans ="yes";
		while(ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name");
			String name = sc.next();
			System.out.println("Enter wickets - separated by | symbol");
			String wicket = sc.next();
			
			String[] wickets = wicket.split("\\|");
			
			
			hm.put(name,new Wicket(wicket,new Bowler(name)));
			
			System.out.println("Do you want to add another player(yes/no)");
			ans = sc.next();
				
		}
		String search = "yes";
		while(search.equalsIgnoreCase("yes")) {
		System.out.println("Enter the player name to search");
		String namep = sc.next();
		
		Wicket p = hm.get(namep);
		
		if(p != null) {	
			System.out.println("Player name : "+namep);
			System.out.println("Wickets :");
			
				String wicketlist = p.getDescription();
				String[] wclist = wicketlist.split("\\|");
				for(int i=0;i<wclist.length;i++) {
					System.out.println(wclist[i]);
				}
				
			
			
		}
		else {
			System.out.println("No player found with the name "+namep);
		}
		System.out.println("Do you want to search another player(yes/no)");
		search=sc.next();
		}
		
	}

}
