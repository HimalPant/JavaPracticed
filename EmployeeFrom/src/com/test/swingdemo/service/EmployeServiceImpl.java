package com.test.swingdemo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.swingdemo.db.db;
import com.test.swingdemo.model.Employee;

public class EmployeServiceImpl implements EmployeeService {
	Connection con = null;

	public EmployeServiceImpl() {
		con = db.getDbcon();
	}

	@Override
	public boolean addEmp(Employee emp) {
		// TODO Auto-generated method stub

		String sql = "insert into employee(fname,lname,gender,phone,email,company,post,city,country,salary,state,dob,joindate)values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setString(4, emp.getPhone());
			pstm.setString(5, emp.getEmail());
			pstm.setString(6, emp.getCompany());
			pstm.setString(7, emp.getPost());
			pstm.setString(8, emp.getCity());
			pstm.setString(9, emp.getCountry());
			pstm.setInt(10, emp.getSalary());
			pstm.setString(11, emp.getState());
			pstm.setDate(12, emp.getDob());
			pstm.setDate(13, emp.getJoindate());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id=" + id;
		try {
			Statement stm = con.createStatement();
			stm.execute(sql);
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmp(Employee emp) {
		String sql = "update employee set fname=?,lname=?,gender=?,phone=?,email=?,company=?,post=?,city=?,country=?,salary=?,state=?,dob=?,joindate=? where id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setString(4, emp.getPhone());
			pstm.setString(5, emp.getEmail());
			pstm.setString(6, emp.getCompany());
			pstm.setString(7, emp.getPost());
			pstm.setString(8, emp.getCity());
			pstm.setString(9, emp.getCountry());
			pstm.setInt(10, emp.getSalary());
			pstm.setString(11, emp.getState());
			pstm.setDate(12, emp.getDob());
			pstm.setDate(13, emp.getJoindate());
			pstm.setInt(14, emp.getId());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Employee p = new Employee();
		String sql = "select * from employee where id=" + id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				p.setId(rs.getInt("id"));
				p.setFname(rs.getString("fname"));
				p.setLname(rs.getString("lname"));
				p.setGender(rs.getString("gender"));
				p.setPhone(rs.getString("phone"));
				p.setEmail(rs.getString("email"));
				p.setCompany(rs.getString("company"));
				p.setPost(rs.getString("post"));
				p.setCity(rs.getString("city"));
				p.setCountry(rs.getString("country"));
				p.setSalary(rs.getInt("salary"));
				p.setState(rs.getString("state"));
				p.setDob(rs.getDate("dob"));
				p.setJoindate(rs.getDate("joindate"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<>();
		String sql = "select * from employee ORDER BY id,fname";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setCompany(rs.getString("company"));
				emp.setPhone(rs.getString("phone"));

				elist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;

	};;

	@Override
	public List<Employee> search(String input) {
		List<Employee> elist = new ArrayList<>();
		String sql = "select * from employee where fname like '%" + input + "%' OR phone like '%"  + input + "%' ";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setCompany(rs.getString("company"));
				emp.setPhone(rs.getString("phone"));

				elist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;
		
		
	}

}
