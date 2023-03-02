package com.ipl.dao;

import java.sql.*;

import com.ipl.config.MyConfig;
import com.ipl.model.Skill;

public class SkillDAO {
	
	public Skill getSkillByID(Long id) throws Exception {
		Skill skill = new Skill();
		
		Connection c = MyConfig.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from skill where id=?");
		ps.setLong(1, id);
		skill.setSkillId(id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			skill.setSkillName(rs.getString(2));
		}
		c.close();
		return skill;
	}

}
