import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Player> hm = new HashMap<>();
		
		String ans ="yes";
		while(ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name");
			String name = sc.next();
			System.out.println("Enter wickets - separated by | symbol");
			String wicket = sc.next();
			String[] wickets = wicket.split("\\|");
			//int wicketCount = wickets.length;
			hm.put(name, new Player(name,wickets.length));
			//for(int i=0;i<wickets.length;i++) {
			//hm.put(name, hm.getOrDefault(name,0 )+1);
			//}
			System.out.println("Do you want to add another player(yes/no)");
			ans = sc.next();
				
		}
		
		String search = "yes";
		while(search.equalsIgnoreCase("yes")) {
		System.out.println("Enter the player name to search");
		String namep = sc.next();
		
		Player p = hm.get(namep);
		//if(hm.containsKey(namep)) {
		if(p != null) {	
			System.out.println("Player name : "+namep);
//			System.out.println("Wicket Count : "+ hm.get(namep));
			System.out.println("Wicket Count : "+p.getWicketCount());
		}
		else {
			System.out.println("No player found with the name ");
		}
		System.out.println("Do you want to search another player(yes/no)");
		search=sc.next();
		}
		
	}

}

