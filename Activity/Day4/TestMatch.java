
public class TestMatch extends Match {
	int overs=90;
	int totalballs=540;

	public TestMatch(int currentscore, float currentover, int target) {
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
