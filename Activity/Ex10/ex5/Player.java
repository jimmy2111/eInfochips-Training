package ex5;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class Player {
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private Integer numberOfMatches;
	private Integer runs;
	private Integer wickets;
	private String nationality;
	private Double powerRating;
	
	public Player(String name, LocalDate dateOfBirth, String skill, Integer numberOfMatches, Integer runs,
			Integer wickets, String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	public Player() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Integer getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(Integer numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getWickets() {
		return wickets;
	}

	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}
	
	public static Player createPlayer(String detail) {
		String[] details = detail.split(",");
		Player p = new Player(details[0],LocalDate.parse(details[1]),details[2],Integer.parseInt(details[3]),
				Integer.parseInt(details[4]),Integer.parseInt(details[5]),details[6],Double.parseDouble(details[7]));
	
		return p ;
	}
	
	public static String highestCount(List<Player> playerList){
		String con = new String();
		Map<String,Integer> cm = new TreeMap<>();
		
		for(Player p : playerList) {
			cm.put(p.getNationality(), cm.getOrDefault(p.getNationality(), 0)+1);
		}
		int max = Collections.max(cm.values());
		
		for(Map.Entry<String, Integer> entry : cm.entrySet()) {
			if(entry.getValue()==max) {
				con = entry.getKey();
			}
			
		}
		
		return con;
		
	}

}
