
public class Wicket {
	private String description;
	private Bowler bowler;
	
	
	public Wicket(String description, Bowler bowler) {
		super();
		this.description = description;
		this.bowler = bowler;
	}
	
	public String getDescription() {
		return description;
	}
	public void setPlayerName(String description) {
		this.description = description;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
	
}
