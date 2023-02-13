package day5;
import java.util.*;
public class RunRate extends Exception {
	static int totaloversfaced;
	static int totalrunsscore;

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the total runs scored");
		totalrunsscore = sc.nextInt();
		System.out.println("Enter the total overs faced");
		totaloversfaced = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		double runrate = (totalrunsscore/totaloversfaced);
		System.out.println("Current run Rate : "+runrate);
		}
		
		
		
		
		
		

	}


