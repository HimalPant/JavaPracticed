package com.test.swingdemo.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.test.swingdemo.db.db;
import com.test.swingdemo.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into user(fname,lname,username, password)values(?,?,?,?)";
		try {
			PreparedStatement pstm = db.getDbcon().prepareStatement(sql);
			pstm.setString(1, user.getFname());
			pstm.setString(2, user.getLname());
			pstm.setString(3, user.getUsername());
			pstm.setString(4, user.getPassword());

			pstm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public User signup(String un, String psw) {
		String sql = "select * from user where username='" + un + "' and password='" + psw + "' ";
		try {
			Statement stm = db.getDbcon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("passwrd"));

				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
