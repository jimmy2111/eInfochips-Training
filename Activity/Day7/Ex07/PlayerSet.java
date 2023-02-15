import java.util.*;
public class PlayerSet {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		TreeSet <String> player = new TreeSet<String>();
		
		int n=sc.nextInt();
		sc.nextLine();
		for (int i=0;i<n;i++) {
			player.add(sc.nextLine());
		}
		for(String players : player) {
			System.out.println(players);
		}
	}

}
