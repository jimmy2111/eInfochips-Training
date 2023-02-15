import java.util.*;
public class ListSwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> top = new ArrayList<String>();
		System.out.println("Enter top 5 teams");
		for(int i=0; i<5;i++) {
			top.add(sc.nextLine());
			
		}
		
		for(String i : top) {
			System.out.println(i);
		}
		System.out.println("Enter swap positions");
		int p1 = sc.nextInt(), p2= sc.nextInt();
		Collections.swap(top, p1, p2);
		for(String i : top) {
			System.out.println(i);
		}
		
	}

}
