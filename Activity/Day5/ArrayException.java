package day5;
import java.util.*;
public class ArrayException extends Exception{
	int size;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayException a1 = new ArrayException();
		try {
		System.out.println("Enter the number of overs");
		a1.size= sc.nextInt();
		int [] runs = new int[a1.size];
		System.out.println("Enter the runs for each over");
		for(int i=0;i<a1.size;i++) {
			runs[i]=sc.nextInt();
		}
		System.out.println("Enter the over number");
		int n = sc.nextInt();
		System.out.println("Runs scored in this over : "+ runs[n-1]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
