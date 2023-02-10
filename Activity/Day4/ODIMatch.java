
public class ODIMatch extends Match {
	int overs=50;
	int totalballs=300;

	public ODIMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
	}
	public float calculateRunRate() {
		float reqRunRate= (getTarget()- getCurrentscore())/(50-getCurrentover());
		return reqRunRate;
		
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
