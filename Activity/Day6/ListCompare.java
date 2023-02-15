import java.util.*;
public class ListCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		ArrayList <String> season14 = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			season14.add(sc.nextLine());
			
		}
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		ArrayList <String> season15 = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			season15.add(sc.nextLine());
			
		}
		
		season14.retainAll(season15);
		System.out.println("Consistent Scorer:");
		for (String i : season14) {
		System.out.println(i);
		}

	}

}
