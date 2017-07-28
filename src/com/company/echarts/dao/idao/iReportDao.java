package com.company.echarts.dao.idao;

import java.util.List;

import com.company.echarts.dao.pojo.Report;

public interface iReportDao {
	
	List<Report> getReportListBydeptno() throws Exception;
}
