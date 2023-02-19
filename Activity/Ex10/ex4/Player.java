package ex04;

import java.time.LocalDate;
import java.util.*;

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
	
	static Map<String,Integer> calculateNationalityCount(List<Player> list){
		Map<String,Integer> cm = new TreeMap<>();
		for(Player p : list) {
			cm.put(p.getNationality(), cm.getOrDefault(p.getNationality(), 0)+1);
		}
		return cm;
		
	}

}
