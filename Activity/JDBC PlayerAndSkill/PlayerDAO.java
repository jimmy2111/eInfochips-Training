package com.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ipl.config.MyConfig;
import com.ipl.model.Player;
import com.ipl.model.Skill;

public class PlayerDAO {
	
	public List<Player> getAllPlayers() throws Exception {
		
		List<Player> p1 = new ArrayList<Player>();
		Connection c = MyConfig.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from player order by name");
		ResultSet rs = ps.executeQuery();
		Skill sk = new Skill();
		SkillDAO skdao = new SkillDAO();
		while(rs.next()) {
			sk = skdao.getSkillByID(rs.getLong(4));
			p1.add(new Player(rs.getLong(1),rs.getString(2),rs.getString(3),sk));
			
		}
		c.close();
		return p1;
		
	}

}
