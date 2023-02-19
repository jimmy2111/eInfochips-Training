package ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Player p1=new Player();
		ArrayList<Player> p= new ArrayList<Player>();
		
	
		System.out.println("Enter the name of the team");
		String name = sc.next();
		Team te = new Team(name, p );
		
		int ans=0;
		while(ans!=4) {
			System.out.println("1.Add Player");
			System.out.println("2.Delete Player");
			System.out.println("3.Display Players");
			System.out.println("4.Exit");
			ans=sc.nextInt();
			sc.nextLine();
			switch(ans) {
			case 1:
				System.out.println("Enter the players detail");
				String player1 = sc.nextLine();
				
				Player p2 = p1.createPlayer(player1);
				
				te.addPlayerToTeam(p2);
				System.out.println("Player successfully added");
				break;
				
			case 2:
				System.out.println("Enter the name of the player to be deleted:");
				String namep = sc.next();
				
				boolean found= te.removePlayerFromTeam(namep);
				if(found) {
					System.out.println("Player successfully deleted");
				}
				else {
					System.out.println("Player not found in the team");
				}
				break;
		
			case 3:
				te.displayPlayer();
				break;
			case 4:
				break;
				
				default:System.out.println("Invalid choice");	
			}	
		}	

	}
	
}
