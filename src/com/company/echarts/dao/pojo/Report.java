package com.company.echarts.dao.pojo;

public class Report {
	private int deptno;
	private double maxsal;
	private double minsal;
	private double avgsal;
	private double sumsal;
	private double counter;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getMaxsal() {
		return maxsal;
	}
	public void setMaxsal(double maxsal) {
		this.maxsal = maxsal;
	}
	public double getMinsal() {
		return minsal;
	}
	public void setMinsal(double minsal) {
		this.minsal = minsal;
	}
	public double getAvgsal() {
		return avgsal;
	}
	public void setAvgsal(double avgsal) {
		this.avgsal = avgsal;
	}
	public double getSumsal() {
		return sumsal;
	}
	public void setSumsal(double sumsal) {
		this.sumsal = sumsal;
	}
	public double getCounter() {
		return counter;
	}
	public void setCounter(double counter) {
		this.counter = counter;
	}
	public Report(int deptno, double maxsal, double minsal, double avgsal, double sumsal, double counter) {
		super();
		this.deptno = deptno;
		this.maxsal = maxsal;
		this.minsal = minsal;
		this.avgsal = avgsal;
		this.sumsal = sumsal;
		this.counter = counter;
	}
	

	
	public Report() {
		super();
	}
	
}
