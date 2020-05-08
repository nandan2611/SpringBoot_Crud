package com.capgemini.CustomAssignment.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
    @Entity
    public class CustomTimePeriod {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customTimePeriodId;
    private long parentPeriodId;
    private long periodTypeId;
    private long periodNum;
    private String periodName;
    private Date fromDate;
    private Date thruDate;
    private boolean isClosed;
    public long getCustomTimePeriodId() {
		return customTimePeriodId;
	}
	public void setCustomTimePeriodId(long customTimePeriodId) {
		this.customTimePeriodId = customTimePeriodId;
	}
	public long getParentPeriodId() {
		return parentPeriodId;
	}
	public void setParentPeriodId(long parentPeriodId) {
		this.parentPeriodId = parentPeriodId;
	}
	public long getPeriodTypeId() {
		return periodTypeId;
	}
	public void setPeriodTypeId(long periodTypeId) {
		this.periodTypeId = periodTypeId;
	}
	public long getPeriodNum() {
		return periodNum;
	}
	public void setPeriodNum(long periodNum) {
		this.periodNum = periodNum;
	}
	public String getPeriodName() {
		return periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}
	public boolean isClosed() {
		return isClosed;
	}
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	
    
    
    

}
