package com.ipl.main;
import java.util.*;

import com.ipl.dao.PlayerDAO;
import com.ipl.model.Player;
import com.ipl.model.Skill;

public class MainPlayerSkill {

	public static void main(String[] args) throws Exception  {
		
		Scanner sc = new Scanner(System.in);
		
		PlayerDAO p1 = new PlayerDAO();
		List<Player> pl = new ArrayList<Player>();
		
		pl = p1.getAllPlayers();
		
		System.out.printf("%-10s%-20s%-20s%s\n","Id","Name","Country","Skill");
		
		for(int i=0;i<pl.size();i++) {
			Player pl1 = pl.get(i);
			Long id = pl1.getPlayerId();
			String name = pl1.getName();
			String country = pl1.getCountry();
			Skill sk = pl1.getSkill();
			
			String skillname = sk.getSkillName();
			
			System.out.printf("%-10s%-20s%-20s%s\n",id,name,country,skillname);
		}
		
		
	}

}
