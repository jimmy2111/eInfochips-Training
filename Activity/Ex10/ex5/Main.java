package ex5;
import java.util.*;

public class Main {
	static String maxcount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		List<Player> pl = new ArrayList<Player>();
		Map<String,Integer> pm = new TreeMap<>();
		
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String detail = sc.nextLine();
			Player player1 = player.createPlayer(detail);
			pl.add(player1);
			maxcount = player.highestCount(pl);
			
		}
		System.out.println("The nationality with maximum players:"+maxcount);

	}

}
