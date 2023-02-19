package ex04;
import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Player> playerList = new ArrayList<Player>();
		Map<String,Integer> tm = new TreeMap<String,Integer>();
		
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String detail=sc.nextLine();
			String[] details = detail.split("\\,");
			Player p1 = new Player(details[0],LocalDate.parse(details[1]),details[2],Integer.parseInt(details[3]),
					Integer.parseInt(details[4]),Integer.parseInt(details[5]),details[6],Double.parseDouble(details[7]));
			playerList.add(p1);
			tm = p1.calculateNationalityCount(playerList);
		}
		
		System.out.format("%-15s%s\n","Country","Count");
		for(Map.Entry<String, Integer> entry : tm.entrySet()) {
			String country = entry.getKey();
			int count = entry.getValue();
			
			System.out.format("%-15s%s\n",country,count);
		}	
		
	}

}
