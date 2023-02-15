import java.util.*;
public class PlayerList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the player details");
	
		System.out.println("Enter player name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		String age = sc.next();
		System.out.println("Enter country");
		String country = sc.next();
		sc.nextLine();
		ArrayList<String> player1  = new ArrayList<String>();
		player1.add(name);
		player1.add(age);
		player1.add(country);
		System.out.println("Player Details");
		for(String i : player1) {
			System.out.println(i);
			
		}
		System.out.println("Enter skill");
		String skill = sc.next();
		System.out.println("Enter the position to add the skill");
		int n=sc.nextInt();
		player1.add(n, skill);
		System.out.println("Player Details");
		for(String i : player1) {
			System.out.println(i);
			
		}
		System.out.println("Enter the position of the detail to be removed");
		int rmv = sc.nextInt();
		player1.remove(rmv);
		
		System.out.println("Player Details");
		for(String i : player1) {
			System.out.println(i);
			
		}
		
			
		}
		
		

	}


