package com.company.echarts.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.company.echarts.dao.idao.iReportDao;
import com.company.echarts.dao.pojo.Report;
import com.company.echarts.dao.util.OracleSessionFactory;

public class daoReportImpl implements iReportDao {

	@Override
	public List<Report> getReportListBydeptno() throws Exception {
		Connection con = OracleSessionFactory.getInstance().getSession();
		String sql = "SELECT deptno,max(sal) maxsal,min(sal) minsal,floor(avg(sal)) avgsal,sum(sal) sumsal,count(*) courter FROM emp group by deptno";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Report> reportlist = new ArrayList<>();
		while(rs.next()) {
			Report result = new Report(rs.getInt(1),rs.getDouble(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getInt(6));
			reportlist.add(result);
		}
		return reportlist;
		
		
		
		
	}
	
}
