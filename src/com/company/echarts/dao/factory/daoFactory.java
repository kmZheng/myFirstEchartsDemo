package com.company.echarts.dao.factory;

import com.company.echarts.dao.idao.iReportDao;
import com.company.echarts.dao.impl.daoReportImpl;

public class daoFactory {
	public static iReportDao getReportDaoInstance() {
		return new daoReportImpl();
	}
	
}
