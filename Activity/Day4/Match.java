
public abstract class Match {
	private int currentscore;
	private float currentover;
	private int target;
	
	Match(int currentscore, float currentover, int target) {
		this.currentscore=currentscore;
		this.currentover=currentover;
		this.target=target;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}

}
