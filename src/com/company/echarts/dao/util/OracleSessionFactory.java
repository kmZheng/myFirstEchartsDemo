package com.company.echarts.dao.util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class OracleSessionFactory {
	private DataSource ds;

	public OracleSessionFactory() {
		super();
		ds = new ComboPooledDataSource("oracle");
	}
	private static OracleSessionFactory sessionFactory;
	public static OracleSessionFactory getInstance() {
		if(sessionFactory == null){
			sessionFactory = new OracleSessionFactory();
		}
		return sessionFactory;
	}
	
	public Connection getSession() throws Exception{
		Connection con = ds.getConnection();
		return con;
	}
	
	public void closeConnection(ResultSet rs,Statement ps,Connection con) {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
