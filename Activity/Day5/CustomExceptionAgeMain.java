package day5;

import java.util.*;

public class CustomExceptionAgeMain{

	public static void main(String[] args) throws CustomException{
		int ag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = sc.nextLine();
		System.out.println("Enter the player age");
		ag = sc.nextInt();
		
			if(ag < 19) {
				throw new CustomException();
			}
			else {
				System.out.println("Player name : " + name);
				System.out.println("Player age : " + ag);
			}
		
		

}
}
