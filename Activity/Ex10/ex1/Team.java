package ex1;

import java.util.Iterator;
import java.util.List;

public class Team {
	private String name;
	List<Player> playerList;
	
	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public Team(String name) {
		super();
		this.name = name;
	}

	public Team() {
		super();
	}

	public String getName() {
		return name;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayerToTeam(Player player) {
		playerList.add(player);
	}
	
	public Boolean removePlayerFromTeam(String name) {
		boolean exist = false;
			for(int i=0;i<playerList.size();i++) {
				Player player = playerList.get(i);
				if(player.getName().equals(name)) {
					playerList.remove(i);
					exist =true;
				}
			}
			
			
		return exist;	
	}
	
	
	public void displayPlayer() {
		if(playerList.isEmpty()) {
			System.out.println("No players to show");
			
		}
		else {
			System.out.println("Players in:"+name);
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n","Name","DateOfBirth",
					"Skill","No of matches","Runs","Wickets","Nationality","Rating");
			
				for(Player p: playerList) {
					System.out.format("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%.1fs\n",p.getName(),p.getDateOfBirth(),p.getSkill(),
							p.getNumberOfMatches(),p.getRuns(),p.getWickets(),p.getNationality(),p.getPowerRating());
				}
			
		}
	}
	}
	
	
	


