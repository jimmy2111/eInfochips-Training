package com.einfochips.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Connection;

import com.einfochips.User;

public class UserDAO {
	
	public boolean insertUser(User u) throws Exception {
		
		//String name=
		//User u1 = new User();
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipldb","root","root");
		
		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPassword());
		ps.setString(4, u.getMobile());
		

		return ps.execute();
	}

}
