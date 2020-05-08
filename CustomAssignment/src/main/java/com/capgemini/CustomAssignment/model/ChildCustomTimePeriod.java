package com.capgemini.CustomAssignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class ChildCustomTimePeriod {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long childPeriodId;
	private String childPeriodName;
}
