
public class T20Match extends Match{
	int overs=20;
	int totalballs=120;

	public T20Match(int currentscore, float currentover, int target) {
		// TODO Auto-generated constructor stub
		super(currentscore, currentover, target);
	}
	public float calculateRunRate() {
		float req= (getTarget()- getCurrentscore())/(overs-getCurrentover());
		return req;
		
	}
	public int calculateBalls() {
		int remballs = (int) (totalballs - (Math.ceil(getCurrentover())*6));
		return remballs;
		
	}
	public void display(double reqRunRate, int balls) {
		
		System.out.println("Requirements:");
		System.out.println("Need "+ (getTarget()- getCurrentscore())+" runs in "+ calculateBalls()+" balls");
		System.out.println("Required RunRate: "+ calculateRunRate());
	}
}
