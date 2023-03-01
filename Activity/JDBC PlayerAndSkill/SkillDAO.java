package com.ipl.dao;

import java.sql.*;

import com.ipl.config.MyConfig;
import com.ipl.model.Skill;

public class SkillDAO {
	
	public Skill getSkillByID(Long id) throws Exception {
		Skill skill = new Skill();
		
		Connection c = MyConfig.getConnection();
		PreparedStatement ps = c.prepareStatement("select skill_id from player where skill_id=?");
		ps.setLong(1, id);
		skill.setSkillId(id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			if(id== 1) {
				skill.setSkillName("Batting");
				
			}
			if(id== 2) {
				skill.setSkillName("Bowling");
				
			}
			if(id == 3) {
				skill.setSkillName("Batting Keeping");
				
			}
			if(id == 4) {
				skill.setSkillName("All Rounder");
				
			}

		}
		c.close();
		return skill;
	}

}
