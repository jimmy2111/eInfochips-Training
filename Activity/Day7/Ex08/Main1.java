import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Team> te = new ArrayList<Team>();
	
		
		System.out.println("Enter number of teams:");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter team "+(i+1)+" detail");
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter number of matches");
			long number = sc.nextLong();
			
			te.add(new Team(name,number));
		}
		
		Comparator tc = (o1,o2)-> {
			if(((Team) o1).getNumberOfMatches()>((Team) o2).getNumberOfMatches()) {
				return 1;
			}
			else if(((Team) o1).getNumberOfMatches()<((Team) o2).getNumberOfMatches()) {
				return -1;
			}
			else {
			return 0;
			}
			
		
	};
	Collections.sort(te, tc);
	
	System.out.println("Team list after sort by number of matches");
	for(Team t : te) {
		System.out.println(t.getName()+" - "+t.getNumberOfMatches());
	}

}
}
