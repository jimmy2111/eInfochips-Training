import java.util.*;
public class MatchMain {
	static int cs,co,tar;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Match Format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int temp =sc.nextInt() ;
		
		switch(temp) {
		
		case 1:
			System.out.println("Enter the current score");
			cs=sc.nextInt();
			System.out.println("Enter the current Over");
			co=sc.nextInt();
			System.out.println("Enter the Target Score");
			tar=sc.nextInt();
			
			ODIMatch odi1 = new ODIMatch(cs,co,tar);
			odi1.calculateBalls();
			odi1.calculateRunRate();
			odi1.display(odi1.calculateRunRate(), odi1.calculateBalls());
			break;
			
		case 2:
			System.out.println("Enter the current score");
			cs=sc.nextInt();
			System.out.println("Enter the current Over");
			co=sc.nextInt();
			System.out.println("Enter the Target Score");
			tar=sc.nextInt();
			
			T20Match t201 = new T20Match(cs,co,tar);
			t201.calculateBalls();
			t201.calculateRunRate();
			t201.display(t201.calculateRunRate(), t201.calculateBalls());
			break;
			
		case 3:
			System.out.println("Enter the current score");
			cs=sc.nextInt();
			System.out.println("Enter the current Over");
			co=sc.nextInt();
			System.out.println("Enter the Target Score");
			tar=sc.nextInt();
			
			TestMatch test1 = new TestMatch(cs,co,tar);
			test1.calculateBalls();
			test1.calculateRunRate();
			test1.display(test1.calculateRunRate(), test1.calculateBalls());
			break;
			
			
		}
		
		
	}

}
