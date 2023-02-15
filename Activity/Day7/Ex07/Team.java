import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
	String name;
	List<Player> playerList;
	
	public Team(String name) {
		super();
		this.name = name;
		this.playerList = new ArrayList<Player>();
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayer(Player playername) {
		playerList.add(playername);
	}

	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
	
}
