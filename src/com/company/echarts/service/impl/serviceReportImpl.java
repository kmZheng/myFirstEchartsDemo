package com.company.echarts.service.impl;

import java.util.List;

import com.company.echarts.dao.factory.daoFactory;
import com.company.echarts.dao.idao.iReportDao;
import com.company.echarts.dao.pojo.Report;
import com.company.echarts.service.iservice.iReportService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class serviceReportImpl implements iReportService {
	private iReportDao reportdao;
	public serviceReportImpl() {
		reportdao = daoFactory.getReportDaoInstance();
	}

	@Override
	public String reportListBydeptno() {
		String jsonResult = null;
		try {
			List<Report> reportlist = reportdao.getReportListBydeptno();
			Gson gson = new Gson();
			jsonResult = gson.toJson(reportlist, new TypeToken<List<Report>>(){}.getType());
			//List<Report> reportList = reportDao.getReportByDeptno();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResult;
		
		
	}

}
