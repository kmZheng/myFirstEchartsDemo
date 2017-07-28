package com.company.echarts.service.factory;

import com.company.echarts.service.impl.serviceReportImpl;
import com.company.echarts.service.iservice.iReportService;

public class serviceFactory {
	public static iReportService getReportDaoInstance() {
		return new serviceReportImpl();
	}
}
