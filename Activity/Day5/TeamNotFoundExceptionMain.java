package day5;
import java.util.*;

public class TeamNotFoundExceptionMain {

	public static void main(String[] args) throws TeamNameNotFoundException {
		Scanner sc= new Scanner(System.in);
		String[] teams = new String[8];
		teams[0]="Chennai Super Kings";
		teams[1]="Sun Risers";
		teams[2]="Delhi Dardevils";
		teams[3]="Kings XI Punjab";
		teams[4]="Kolkata Knight Riders";
		teams[5]="Mumbai Indians";
		teams[6]="Rajasthan Royals";
		teams[7]="Royal Challengers Banglore";
		
		System.out.println("Enter the expected winner team of IPL Season 10");
		String winteam = sc.nextLine();
		System.out.println("Enter the expected runner Team of IPL Season 10");
		String runteam = sc.nextLine();
		
		for(int i=0;i<8;i++) {
			if(winteam.equals(teams[i])) 
			{
				
				System.out.println("Expected IPL Season 10 winner: "+teams[3]);
				System.out.println("Expected IPL Season 10 runner: "+teams[4]);
				break;
			}
			else {
				throw new TeamNameNotFoundException();
			}
		}
		

}
}
